package fc_java.cousrse2.part1;

import fc_java.model2.Book;
import java.util.ArrayList;
import java.util.List;

public class ArrayListBestTest {
    public static void main(String[] args) {
        List<Book> list = new ArrayList(); // <>안에 사용할 타입만 넣기 -> 안에 타입이 Book 배열로 만들어진다
        //  upcasting, downcasting개념이 없어짐
        list.add(new Book("자바",124445,"한빛","홍길동"));
        list.add(new Book("c",123489,"한빛","가길동"));
        list.add(new Book("python",124005,"한빛","나길동"));

//        Book bo = (Book)list.get(0); // [다운 캐스팅]필수!!!
//        System.out.println(bo.toString());

        for (int i=0; i< list.size();i++){
//            System.out.println(list.get(i));
            System.out.println(list.get(i)); // Object -> Book (JVM에서 자동으로 Book의 toString()호출)
        }
    }

}
