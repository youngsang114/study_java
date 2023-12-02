package fc_java.model2;

public class FunctionInterfaceTest1 {
    public static void main(String[] args) { // 인터페이스의 구현체를 이용해 객체를 생성해 프로그래밍하는 방법
        MathOperation mo = new MathOperationImpl();
        int result= mo.operation(11,19);
        System.out.println("result = " + result);
    }
}
