package fc_java.part2;

import java.util.Scanner;
public class IfBasicTest {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("숫자 하나를 입력하세요:");
        int num = scanner.nextInt();
        if ((num&7)==0){
            System.out.printf("%d는 7의 배수입니다",num);
        }
        else{
            System.out.printf("%d는 7의 배수가 아닙니다",num);
        }
        System.out.println();
        System.out.println("--------------------");

        System.out.print("너의 나이는?");
        int age = scanner.nextInt();
        if (age>=19){
            System.out.println("성인");
        }else {
            System.out.println("미자");
        }

        scanner.close();

    }
}
