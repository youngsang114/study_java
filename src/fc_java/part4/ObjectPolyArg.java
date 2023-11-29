package fc_java.part4;

import fc_java.poly.A;
import fc_java.poly.B;

public class ObjectPolyArg {
    public static void main(String[] args) {
        A a=new A();
        display(a);
        B b=new B();
        display(b);
    }
    private static void display(Object obj){ // object로 다형성 인수를 사용하였다
        if (obj instanceof A){
            ((A)obj).printGo();
        }else {
            ((B)obj).printGo();
        }
    }
}
