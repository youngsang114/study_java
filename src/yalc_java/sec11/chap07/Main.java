package yalc_java.sec11.chap07;

import yalc_java.sec07.chap04.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        try {
            //  여기서 아래의 메소드들을 하나씩 호출할 것
            supplyAsyncEx();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //  각각 false, true로 시험해 볼 것
    public static void exceptionallyEx (Boolean error) throws ExecutionException, InterruptedException {
        CompletableFuture.supplyAsync(() -> {
            takeTime(error);
            return "ㅇㅇ 안녕";

        }).exceptionally(e -> {
            //  💡 exceptionally : 오류 발생시 대체 값 반환
            e.printStackTrace();
            return "안녕 못해.";
        }).thenApply(s -> {
            takeTime(false);
            return "대답: " + s;
        }).thenAccept(
                System.out::println
        ).get();
    }
    public static void thenApplyEx2 () throws ExecutionException, InterruptedException {
        CompletableFuture.supplyAsync(() -> {
            takeTime(false);
            return new Random().nextBoolean();

            //  ⭐ Apply 연속 사용
        }).thenApply(b -> {
            takeTime(false);
            return new Swordman(b ? Side.RED : Side.BLUE);
        }).thenApply(s -> {
            takeTime(false);
            return s.toString();
        }).thenAccept(
                System.out::println
        ).get();
    }
    public static void thenApplyEx1 () throws ExecutionException, InterruptedException {
        CompletableFuture.supplyAsync(() -> {
            takeTime(false);
            return new Random().nextInt(0, 6) + 1;

        }).thenApply(
                //  💡 thenApply : 얻어온 값을 Function에 넣어 다른 값 반환
                //  - 스트림의 map과 비슷
                i -> {
                    takeTime(false);
                    return "이번 숫자: " + i;
                }
        ).thenAccept(
                System.out::println
        ).get();
    }
    public static void thenAcceptEx2 () throws ExecutionException, InterruptedException {

        //  ⭐️ 비동기 메소드 체이닝

        CompletableFuture<Void> print5nums = CompletableFuture.supplyAsync(() -> {
            List<Integer> ints = new ArrayList<>();
            IntStream.range(0, 5).forEach(i -> {
                takeTime(false);
                ints.add(i);
            });
            return ints;
        }).thenAccept(list -> {
            takeTime(false);
            list.stream().forEach(System.out::println);
        });

        System.out.println("- - - 중간에 다른 코드들 진행 - - -");

        print5nums.get();
    }

    public static void thenAcceptEx1 () throws ExecutionException, InterruptedException {
        CompletableFuture<String> getHello = CompletableFuture.supplyAsync(() -> {
            System.out.println("값 받아오기 시작");
            takeTime(false);
            return "Hello";
        });

        //  💡 thenAccept : 받아온 값을 Consumer로 실행
        //  - 이전 과정으로부터 얻은 값으로 할 일을 지정함 (비동기)
        //  - 여기서는 일을 정해두기만 할 뿐, 호출은 get으로 (동기)
        //  - get으로 호출해도, supplyAsync 작업이 끝나고 나서야 실행
        CompletableFuture<Void> printHello = getHello.thenAccept(s -> {
            System.out.println("받아온 값 처리 시작");
            takeTime(false);
            System.out.println(s);
        });

        System.out.println("- - - 중간에 다른 코드들 진행 - - -");

        //printHello.get(); // ⭐ 활성화하고 나서 재실행
    }

    public static void supplyAsyncEx () throws ExecutionException, InterruptedException {

        //  💡 supplyAsync : Supplier를 받아 비동기 작업 실행
        //  - 결과를 CompletableFuture의 형태로 반환
        CompletableFuture<String> getHello = CompletableFuture.supplyAsync(() -> {
            takeTime(false);
            return "Hello";
        });

        System.out.println("- - - get 사용 전 - - -");

        //  💡 Future처럼 get을 사용하면 블록킹 발생
        //  - 값을 받아올 때까지 다음 코드의 진행을 막음 (비동기가 아니게 됨)
        String hello = getHello.get();
        //  ⚠️ 실습 편의를 위해 본 메소드에서 예외 던짐
        //  - 실행하는 곳에서 받음 주의

        System.out.println("- - - get 사용 후 - - -");
        System.out.println(hello);
        //  ❌ 실습 후 주석처리 할 것
    }
    public static void takeTime (boolean error) {

        //  시간이 걸리고 예외 가능성 있는 작업 시뮬레이션

        try {
            int randMilliSec = new Random().nextInt(1000, 1500);
            Thread.sleep(randMilliSec);
            System.out.printf("... %f 초 경과 ...%n", randMilliSec / 1000.0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (error) throw new RuntimeException("⚠️ 오류 발생");
    }
}
