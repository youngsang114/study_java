package fc_java.cousrse2.part2;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        // ArrayList에  10,20,30,40,50 5개의 정수(int)를 저장하고 출력하시오
        // ArrayList -> Object[] <--X-- int
        // ArrayList -> Object[] <--O-- Integer(Wrapper)
        // Collection Framework API 사용 위해서는 wrapper 클래스로 기본 자료형을 사용자 지정 자료형으로 변환해야한다
        // ArrayList -> Object[] <--(Auto-boxing:Integer)-- int
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10); // auto-boxing으로 Integer클래스 로 들어감, list.add(new Integer(10));
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        //int <--(Auto-unboxing)--Integer
        for (int data:list) {
            System.out.print(data+"\t");
        }
    }
}
