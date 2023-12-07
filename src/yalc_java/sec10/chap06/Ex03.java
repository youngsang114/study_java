package yalc_java.sec10.chap06;


import yalc_java.sec09.chap05.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03 {
    public static void main(String[] args) {
        int numFromOpt = IntStream.range(0, 100)
                //.parallel() // 병렬 실행 (이후 배움), 주석해제 해 볼 것

                .filter(i -> i % 2 == 1)
                //.filter(i -> i > 100) // 주석해제 후 다시 실행해 볼 것

                //  💡 첫 번째 요소를 반환
                // 여기서 나오는 메서드들이 전부 Optional 형태의 데이터를 반환하는 그런 메서드들이다

                .findFirst() // 항상 순서상 첫번 째 것을 반환 -> 물줄기(스트림)을 혼자 처음부터 쭉 훑는다
                //.findAny() // ⭐️ 병렬작업 시 먼저 나오는 것 반환 -> 이 물줄기를 여렇이 나눠서 훑는다
                // 병렬작업 시 findAny가 보다 효율적
                // (순서가 중요하지 않다면)

                //.max()
                //.min()

                //  평균값을 ⭐️ Double로 반환
                //.average()

                //.reduce((prev, curr) -> prev + curr) -> reduce는 초기값이 없을때 : Optional반환
//                                                                 초기값이 있을때 : retrun값 null아니게 존재

                .orElse(-1); // Optional이 반환되므로
        //  혹은 기타 Optional의 인스턴스 메소드 사용

        String[] names = {
                "강백호", "서태웅", "채치수", "송태섭", "정대만",
                "윤대협", "변덕규", "황태산", "안영수", "허태환",
                "이정환", "전호장", "신준섭", "고민구", "홍익현",
                "정우성", "신현철", "이명헌", "최동오", "정성구"
        };

        Stream<String> nameStream = Arrays.stream(names);

        Random random = new Random();
        random.setSeed(4); // 균일한 결과를 위해 지정된 시드값
        List<Person> people = nameStream
                .map(name -> new Person(
                        name,
                        random.nextInt(18, 35),
                        random.nextDouble(160, 190),
                        random.nextBoolean()
                ))
                .sorted()
                .toList();

        Person personFromOpt = people.stream()
//                .filter(p -> !p.isMarried() && p.getAge() < 20 && p.getHeight() > 189)

//                .findFirst()

                .max(Comparator.comparingDouble(Person::getHeight))
                //.min(Comparator.comparingInt(Person::getAge))

                .orElse(new Person("엄친아", 19, 189.9, false));
    }
}
