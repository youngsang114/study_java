package fc_java.part2;

public class VDATest {
    public static void main(String[] args) {
        // 프로그래밍에 3대 요소 -> 변수(V),자료형(D),할당(A)
        // 정수 한 개를 저장하기 위해서 변수를 선언 하시요
        // 변수 a에 10을 저장하고 a에 저장된 값을 변수 b에 저장하고 변수 b에 10을 곱하여 변수 c에 저장하시요
        int a = 10;
        int b = a;
        int c = b * 10;
        // sum이라는 변수에 1부터 5까지의 수를 누적(accumulate)해서 출력 하시요
        int sum = 0; // main이라는 메소드 안에서 만들어진 변수 --> main 안에서만 사용할 수 있는 변수 (지역 변수)
        // 지역변수는 무조건 초기화를 하고 사용해야 한다!!!
        for(int i=1; i<6; i++){
            sum+=i;
        }
        System.out.println("sum = " + sum);
        // x=10, y=20을 저장하고 변수의 값을 서로 교환(swap)하여 출력하시요
        int x=10;
        int y=20;
        int tmp;
        tmp = y;
        y = x;
        x = tmp;
        System.out.printf("x=%d%ny=%d%n",x,y);
    }
}
