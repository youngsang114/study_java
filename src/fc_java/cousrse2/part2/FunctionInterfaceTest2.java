package fc_java.cousrse2.part2;

import fc_java.model2.MathOperation;

public class FunctionInterfaceTest2 {
    public static void main(String[] args) {
        //  MathOperation 인터페이스를 내부 익명클래스로 구현해보자
//        MathOperation mo = new MathOperation(); // 인터페이스는 객체를 만들 수 없다
        MathOperation mo = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };
        int result = mo.operation(10,20);
        System.out.println("result = " + result);


    }
}
