package fc_java.cousrse2.part2;

import fc_java.model2.Movie;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {
    public static void main(String[] args) {
        /*List list = new ArrayList<>(5); // Object[]
        list.add(new Movie("괴물","봉준호",2006,"한국"));
        list.add("Hello");
        // Object 다형성 배열이므로 나중에 하나하나 다운 캐스팅해서 처리하기 어렵다.
        System.out.println(list.get(0).toString());
        System.out.println(list.get(1));*/

        List<Movie> list = new ArrayList<>(5);
        list.add(new Movie("괴물","봉준호",2006,"한국"));
        list.add(new Movie("기생충","봉준호",2019,"한국"));
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        // 이렇게 제네릭타입을 사용하면, 타입을 명시적으로 지정할 수 있고, 타입 안정성을 보장할 수 있다
    }
}
