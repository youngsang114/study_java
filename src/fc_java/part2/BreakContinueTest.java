package fc_java.part2;

public class BreakContinueTest {
    public static void main(String[] args) {
        //char[ ] c={‘s’,’h’,’u’,’t’,’d’,’o’,’w’,’n’}; 위 배열의 값을 출력 중 'o'라는 문자를 만나면 반복을 중지하세요.
        char[ ] c={'s','h','u','t','d','o','w','n'};
        for (int i =0; i<c.length; i++){
            if (c[i] == 'o') break;  // 한 줄일 때는 {}필요 없이 적을 수 있다.
            System.out.println(c[i]);
        }

        // 1~10까지의 수 중 3의 배수의 개수를 구하여 출력하세요.
        int num =0;
        for (int i=1; i<=10; i++){
            if (i%3!=0) continue;
            num++;
        }
        System.out.println(num);
    }
}
