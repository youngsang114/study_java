package fc_java.part4;

import fc_java.poly.A;

public class ObjectTest {
    public static void main(String[] args) {
        // A 객체를 Upcasting으로 생성하시오
        Object obj = new A(); // Upcasting
        ((A)obj).display();   // Downcasting
    }
}
