package fc_java.cousrse2.part2;

import fc_java.model2.MathOperation;

public class LambdaExample {
    public static void main(String[] args) {
        // 이렇게 익명 메서드 구현
        /*MathOperation add = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };*/

        //익명 메서드 구현 -> [람다식](코드 간결)
        // [람다식] : [코드를 간결], [확장], [구현] 이 쉽다
        // (parameters) -> {expression}
        // (int x, int y)-> {return x+y;};
        MathOperation add = (int x, int y)->{return x+y;};
        MathOperation multi = (x,y) -> x*y;
        int result =add.operation(14,16);
        System.out.println(result);

        System.out.println("--------------------");

        int mulresult = multi.operation(5,2);
        System.out.println(mulresult);
    }
}
