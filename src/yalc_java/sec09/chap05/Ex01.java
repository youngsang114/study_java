package yalc_java.sec09.chap05;

import java.util.Arrays;
import java.util.stream.*;

public class Ex01 {
    public static void main(String[] args) {
        IntStream
                .range(1, 100)
                .filter(i -> i % 2 == 0)
                //  💡 아래의 중간과정을 하나하나 주석해제해 볼 것
                .skip(10)
                //.limit(10)
                //.map(i -> i * 10)
                .forEach(System.out::println);

        System.out.println("\n- - - - -\n");

        String str1 = "Hello World! Welcome to the world of Java~";

        str1.chars().forEach(System.out::println);

        System.out.println("\n- - - - -\n");
        // 가장 큰 문자 하나만 받을 거임 Stream을 통해서
        char str1MaxChar = (char) str1.chars()
                .max() // OptionalInt 반환 - 이후 배울 것 -> 여기서부터 Stream이 아니다!
                // max(),min()은 하나의 값이 나가므로 -> 최종단계이댜
                //.min() // 변경해 볼 것
                .getAsInt();

        //  사용되는 모든 알파벳 문자들을 정렬하여 프린트
        str1.chars()
                .sorted()
                .distinct()
//                .filter(i -> (i >= 'A' && i <= 'Z') || (i >= 'a' && i <= 'z'))
                .filter(Character::isLetter) // isLetter메서드 -> 알파벳인지 true,false로 반환
                .forEach(i -> System.out.print((char) i));

        System.out.println("\n- - - - -\n");

        //  대소문자 구분 없이 중복 제거한 뒤 정렬하고 쉼표로 구분
        // 원시값의 스트림은 다른 자료형의 스트림으로 바뀔 수 없다
        // 바꿀려면 원시값의 스트림을 참조형 스트림으로 바꾸고 그 후에 다른 자료형의 스트림으로 바꿔야한다

        String fromStr1 = str1.chars()
                .boxed()
                // 💡 boxed를 사용하여 Stream<Integer>으로 변환
                //  요소를 다른 타입으로 바꾸려면 Stream<T>을 사용해야 함

                // valueOf() : 원시자료형을 문자열로 바꿔주는 메서드
                // intValue() : Integer -> int로 언박싱 해주는 메서드

                .map(i -> String.valueOf((char) i.intValue())) // i에 Integer 인스턴스가 들어있다
                .map(String::toUpperCase)
                .filter(s -> Character.isLetter(s.charAt(0)))
                .sorted()
                .distinct()
                .collect(Collectors.joining(", "));

        System.out.println("\n- - - - -\n");

        //  💡 peek으로 중간 과정 체크하기
        //  - 스트림이나 요소를 변경하지 않고 특정 작업 수행 - 디버깅에 유용
        String oddSquaresR = IntStream.range(0, 10).boxed()
                .peek(i -> System.out.println("초기값: " + i))
                .filter(i -> i % 2 == 1)
                .peek(i -> System.out.println("홀수만: " + i))
                .map(i -> i * i)
                .peek(i -> System.out.println("제곱: " + i))
                .sorted((i1, i2) -> i1 < i2 ? 1 : -1)
                .peek(i -> System.out.println("역순: " + i))
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        Integer[] ints = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        //  💡 [allMatch]/[anyMatch] : (모든 요소가/어느 한 요소라도) -> boolean을 반환하는 최종 단계
        //  - 주어진 Predicate에 부합하는가 여부 반환
        boolean intsMatch = Arrays.stream(ints)
                .allMatch(i -> i > 0);
        //.allMatch(i -> i % 2 == 0);
        //.anyMatch(i -> i < 0);
        //.anyMatch(i -> i % 2 == 0);

        System.out.println("\n- - - - -\n");

        //  💡 takeWhile/dropWhile 주어진 Predicate을 충족시킬 때까지 취함/건너뜀
        //  💡 count : 중간과정을 거친 요소들의 개수를 반환  -> 최종연산
        long afterWhileOp = Arrays.stream(ints)
                .takeWhile(i -> i < 4)
                //.dropWhile(i -> i < 4)
                .peek(System.out::println)
                .count();

        //  💡 sum : IntStream, LongStream, DoubleStream 요소의 총합 반환

        int intsSum = IntStream.range(0, 100 + 1)
                //.filter(i -> i % 2 == 1)
                //.filter(i -> i % 2 == 0)
                //.filter(i -> i % 3 == 0)
                .sum();

        System.out.println("\n- - - - -\n");

        double doubleSum = DoubleStream.iterate(3.14, i -> i * 2)
                .limit(10)
                .peek(System.out::println)
                .sum();

        System.out.println("\n- - - - -\n");

        //  💡 reduce : 주어진 BiFunction으로 값을 접어나감
        //  seed 값이 없을 때 : Optional 반환 (빈 스트림일 수 있으므로)
        int intReduce = IntStream.range(1, 10)
                .filter(i -> i % 2 == 1)
                .reduce((prev, curr) -> {
                    System.out.printf("prev: %d, cur: %d%n", prev, curr);
                    return prev * curr;
                })
                .getAsInt(); // 필요함
        //  seed 값이 있을 때 : 실제 값 반환
        // seed값이 있으면 getAsInt()를 안붙여줘도 된다
        int intReduceWithSeed = IntStream.range(1, 10)
                .reduce(2, (prev, curr) -> prev * curr);

        StringStat stringStat = "Hello World! Welcome to the world of Java~"
                .chars()
                .boxed()
                .reduce(
                        new StringStat(), // 초기값으로 StringStat의 인스턴스 값을 넣어준다 0,0,0,0
                        (ss, i) -> {
                            ss.length++;
                            if (i >= 'A' && i <= 'Z') { ss.upperCases++; }
                            else if (i >= 'a' && i <= 'z') { ss.lowerCases++; }
                            else { ss.nonLetters++; }
                            return ss;
                        },
                        //  아래의 combiner 인자는 병령 연산에서만 작용 (여기서는 무의미)
                        //  요소와 다른 타입을 반환하는 오버로드의 필수인자이므로 임의로 넣음
                        (ss1, ss2) -> ss1
                );
    }

    //  내부 정적 클래스
    public static class StringStat {
        int length = 0;
        int upperCases = 0;
        int lowerCases = 0;
        int nonLetters = 0;
    }
}
