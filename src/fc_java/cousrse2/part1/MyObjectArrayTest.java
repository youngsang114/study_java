package fc_java.cousrse2.part1;

import fc_java.model2.*;
import fc_java.model2.ObjectArray;

public class MyObjectArrayTest {
    public static void main(String[] args) {
        // A,B,C 객체를 배열(Object[])에 저장하고 출력하세요
        ObjectArray list = new ObjectArray(); //다형성 배열
        list.add(new A()); // upcasting object element = new A()
        list.add(new B());
        list.add(new C());

        A a =(A)list.get(0); // A <-Object
        a.display();
        B b =(B)list.get(1); // B <-Object
        b.display();
        C c =(C)list.get(2); // C <-Object
        c.display();

        System.out.println("-----------------");

        for(int i=0; i< list.size();i++) {
            if (list.get(i) instanceof A) {
                ((A) list.get(i)).display();
            } else if (list.get(i) instanceof B) {
                ((B) list.get(i)).display();
            } else ((C) list.get(i)).display();
        }
    }
}
