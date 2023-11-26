package fc_java.part2;

public class ArithmeticOperTest {
    public static void main(String[] args) {
        int digit =3625;
        System.out.println(digit%10);
        System.out.println(digit/10%10);
        System.out.println(digit/100%10);
        System.out.println(digit/1000);

        int num =2579;
        // 짝수인지 홀수인지 구해보기 / 배수인지 구해보기
        if (num%2==0){
            System.out.println("숫자는 짝수입니다");
        }else {
            System.out.println("숫자는 홀수입니다");
        }
    }
}
