package yalc_java.sec11.chap01;

import java.util.stream.IntStream;

public class WrongSleep {
    public static void main(String[] args) {
        Thread sleeper = new Thread(
                () -> IntStream.range(0, 5)
                        .forEach(i -> {
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            System.out.println('쿨');
                        })
        );
        sleeper.start();

        try {
            //  ⚠️ sleeper 쓰레드를 재우려고 했지만
            //  - sleep은 정적(클래스) 메소드!
            //  - 현 쓰레드가 자버림
            // 특정 쓰레드를 sleep 시키려면, 그 쓰레드안에서 사용해야 한다
            sleeper.sleep(1000);
            // 즉 쓰레드에 인스턴스에 sleep을 하는건 잘못된 방법이다

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("잘잤다!");
    }
}
