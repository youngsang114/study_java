package fc_java.part2;

import java.util.Scanner;
public class IfElseTest {
    public static void main(String[] args) {
        // 윤년 : 4의 배수인 년도에서(100으로 나누어 떨어지는 년도 제외), 400의 배수인 년도

        Scanner scan = new Scanner(System.in);
        System.out.print("년도를 입력하세요:");
        int year = scan.nextInt();

        if ((year % 4==0) && (year % 100!=0) || (year %400==0)){
            System.out.println("윤년입니다");
        }else {
            System.out.println("윤년이 아닙니다");
        }
        System.out.println("프로그램 종료");

        scan.close();

    }

}
