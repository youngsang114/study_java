package fc_java.part4;

import fc_java.poly.B;
import fc_java.poly.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board b = new Board();
        b.setTitle("게시글입니다");
//        System.out.println(b.getTitle());
        System.out.println(b.toString()); // 번지가 나온다 -> 해쉬코드로
        System.out.println(b);            // tostirng 생략가능
    }

}
