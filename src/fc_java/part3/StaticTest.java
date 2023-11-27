package fc_java.part3;

public class StaticTest {
    public static void main(String[] args) {
        int a =10;
        int b=10;
        //a+b =?
        int sum = StaticTest.hap(a,b);
        System.out.println("sum = " + sum);
    }
    // 매개변수 2개의 정수를 입력 받아서, 총합을 구하여 리턴 하는 [메서드를 정의] 하시오
    public static int hap(int a, int b){
        int v =a+b;
        return v;
    }
}
