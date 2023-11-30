package fc_java.cousrse2.part1;

import fc_java.model2.Book;
import fc_java.model2.BookArray;

public class MyBookArrayTest {
    public static void main(String[] args) {
        //책 3권의 데이터를 배열에 저장하고 출력하세요
        BookArray list = new BookArray();
        list.add(new Book("자바",124445,"한빛","홍길동"));
        list.add(new Book("c",123489,"한빛","가길동"));
        list.add(new Book("python",124005,"한빛","나길동"));

        Book vo =list.get(0);
        System.out.println(vo);
        vo =list.get(1);
        System.out.println(vo);
        vo= list.get(2);
        System.out.println(vo);
    }

}
