package yalc_java.sec09.chap04;

import yalc_java.sec07.chap04.*;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class Ex02 {
    public static void main(String[] args) {
        // Stream<자료형> : Stream 또한 제네릭으로 구성

        //  💡 [1.배열로부터] 생성
        Integer[] integerAry = {1, 2, 3, 4, 5};
        Stream<Integer> fromArray = Arrays.stream(integerAry); // Arrays : 배열에 관한 여러 기능을 제공하는 클래스
        // 배열에서 스트림을 만들때, Arrays.stream(배열) -> Array의 클래스 메서드 사용!
        Object[] fromArray_Arr = fromArray.toArray();
        // toArray() : 흘러가는 스트림을 배열에 담기!(스트림의 메서드) 재사용 불가

        //  ⚠️ 런타임 에러
        //  - 스트림은 한 번 사용하면 끝 (흘러가버린 물)
        //Object[] ifReuse = fromArray.toArray();

        //  원시값의 배열로부터는 [스트림의 클래스가] 달라짐
        // int형 스트림 클래스 -> IntStream
        // Double형 스트림 클래스 -> DoubleStream
        // 참조형 스트림 클래스 -> Stream

        int[] intAry = {1, 2, 3, 4, 5};
        IntStream fromIntAry = Arrays.stream(intAry);
        int[] fromIntAry_Arr = fromIntAry.toArray();

        double[] dblAry = {1.1, 2.2, 3.3};
        DoubleStream fromDblAry = Arrays.stream(dblAry);
        double[] fromDblAry_Arr = fromDblAry.toArray();

        //  💡 [2.값들로] 직접 생성
        // 해당스트림 클래스의 of 클래스 메서드를 이용한다
        IntStream withInts = IntStream.of(1, 2, 3, 4, 5);
        Stream<Integer> withIntegers = Stream.of(1, 2, 3, 4, 5);
        Stream<Unit> withUnits = Stream.of(
                new Swordman(Side.BLUE),
                new Knight(Side.BLUE),
                new MagicKnight(Side.BLUE)
        );
        Object[] withUnits_Arr = withUnits.toArray();

        //  💡 [3.컬렉션으로부터] 생성
        // 컬렉션에 stream이라는 default 구현 메서드로 stream 만든다
        List<Integer> intAryList = new ArrayList<>(Arrays.asList(integerAry));
        Stream fromColl1 = intAryList.stream();
        Object[] fromColl1_Arr = fromColl1.toArray();

        //  맵의 경우 엔트리의 스트림으로 생성
        Map<String, Character> subjectGradeHM = new HashMap<>();
        subjectGradeHM.put("English", 'B');
        subjectGradeHM.put("Math", 'C');
        subjectGradeHM.put("Programming", 'A');
        Object[] fromHashMap_Arr = subjectGradeHM.entrySet().stream().toArray();

        //  💡 [4.빌더로 생성]
        // of를 이용해 한번에 stream에 넣어줬었눈데, 중간중간 하나씩 넣어야하는 경우가 있다면 Stream.Builder 클래스를 사용한다
        // 음, new로 인스턴스 생성 안하는거 보니까 static 메서드겠네~
        // builder하나 선언 하고
        // accept()메서드로 추가한다음에
        // 객체에.build() 메서드로 Stream으로 만들어준다
        Stream.Builder<Character> builder = Stream.builder();
        builder.accept('스');
        builder.accept('트');
        builder.accept('림');
        builder.accept('빌');
        builder.accept('더');
        Stream<Character> withBuilder = builder.build();
        Object[] withBuilder_Arr = withBuilder.toArray();

        //  💡 [5.concat 메소드]로 생성
        Stream<Integer> toConcat1 = Stream.of(11, 22, 33);
        Stream<Integer> toConcat2 = Stream.of(44, 55, 66);
        Stream<Integer> withConcatMethod = Stream.concat(toConcat1, toConcat2);
        Object[] withConcatMethod_Arr = withConcatMethod.toArray();

        //  💡 [6.이터레이터로] 생성
        //  - 인자: 초기값, 다음 값을 구하는 람다 함수
        //  - limit으로 횟수를 지정해야 함
        Stream<Integer> withIter1 = Stream
                .iterate(0, i -> i + 2) // iterate는 seed값을 인자로 받고, UnaryOperator또한 인자로 받는다
                .limit(10); // 총 10번한다
        Object[] withIter1_Arr = withIter1.toArray();

        Stream<String> withIter2 = Stream
                .iterate("홀", s -> s + (s.endsWith("홀") ? "짝" : "홀"))
                .limit(8);
        Object[] withIter2_Arr = withIter2.toArray();

        //  💡 [7.원시자료형 스트림의] [기능]들로 [생성]
        // intStream의 클래스 메서드 range(시작값, 끝값)
        IntStream fromRange1 = IntStream.range(10, 20); // 20 미포함
        IntStream fromRange2 = IntStream.rangeClosed(10, 20); // 20 포함
        // 원시 자료형 스트림의 boxed 메서드를 이용해서 -> Stream 즉 참조 자료형 스트림으로 변환해준다
        Stream<Integer> fromRangeBox = fromRange1.boxed();
        Object[] fromRangeBox_Arr = fromRangeBox.toArray();

        //  💡 [8.Random 클래스의] [스트림] 생성 메소드들
        // Random 클래스의 ints(몇개, 시작값, 끝값) 클래스 메서드사용!
        IntStream randomInts = new Random().ints(5, 0, 100);
        int[] randomInts_Arr = randomInts.toArray();

        DoubleStream randomDbls = new Random().doubles(5, 2, 3);
        double[] randomDbls_Arr = randomDbls.toArray();

        //  문자열을 각 문자에 해당하는 정수의 스트림으로
        // 문자는 각각의 숫자 -> IntStream
        // 문자열에 char() 메서드를 이용 -> return IntStream;
        IntStream fromString = "Hello World".chars();
        int[] fromString_Arr = fromString.toArray();

        //  💡 [9.파일로부터] 생성
        //  - File I/O : 이후 배울 것
        Stream<String> fromFile;
        Path path = Paths.get("./src/yalc_java/sec09/chap04/turtle.txt");
        try {
            fromFile = Files.lines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Object[] fromFile_Arr = fromFile.toArray();

        //  💡 [10.빈 스트림] 생성
        //  - 스트림을 받는 메소드 등에서 종종 사용
        Stream<Double> emptyDblStream = Stream.empty();
    }
}
