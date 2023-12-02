package fc_java.cousrse2.part2;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("banana"); // ArayList는 중복이 가능하므로, 중복 데이터 넣어보기

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(list.size()-1)); // 4-1 = 3

        System.out.println("----------------");

        list.remove(0);
        list.set(2,"orange");

        for (String str:list) {
            System.out.println(str);
        }
    }
}
