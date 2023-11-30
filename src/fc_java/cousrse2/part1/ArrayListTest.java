package fc_java.cousrse2.part1;

import fc_java.model2.Book;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        // Book 3권을 배열에 저장하고 출력하세요
        // ArrayList 사용
        List list = new ArrayList(); // 기본크기(10); : Object[] -> 다운 캐스팅 필요
        // arraylist 자동으로 배열이 늘어난다!
        list.add(new Book("자바",124445,"한빛","홍길동"));
        list.add(new Book("c",123489,"한빛","가길동"));
        list.add(new Book("python",124005,"한빛","나길동"));

//        Book bo = (Book)list.get(0); // [다운 캐스팅]필수!!!
//        System.out.println(bo.toString());

        for (int i=0; i< list.size();i++){
            System.out.println((Book)list.get(i));
            System.out.println(list.get(i)); // Object -> Book (JVM에서 자동으로 Book의 toString()호출)
        }
    }
}
