package fc_java.cousrse2.part2;

import fc_java.model2.MathOperation;
// 인터페이스를 구현해서 사용하는 기본적인 방법
public class FunctionInterfaceTest implements MathOperation {
    public static void main(String[] args) {
        MathOperation mo =new FunctionInterfaceTest();
        int result = mo.operation(10,20);
        System.out.println(result);

    }
    @Override
    public int operation(int x, int y) {
        return x+y;
    }
}
