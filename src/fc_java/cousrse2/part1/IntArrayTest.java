package fc_java.cousrse2.part1;

import fc_java.model2.BookArray;
import fc_java.model2.IntArray;

public class IntArrayTest {
    public static void main(String[] args) {
        // 정수 3개를 배열에 저장하고 출력 =>[]
        // api를 만들어서 편리하게 !!!
        IntArray list = new IntArray();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.size());
    }
}
