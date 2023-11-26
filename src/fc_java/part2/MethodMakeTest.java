package fc_java.part2;

public class MethodMakeTest {
    public static void main(String[] args) {
        int result = add(3,5);
        System.out.println(result);

    }
    // 매개변수로 2개의 정수를 받아서 총합을 구하여 리턴 하는 [메서드를 정의] 하세요
    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }


}
