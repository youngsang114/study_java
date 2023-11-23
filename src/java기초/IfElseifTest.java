package java기초;

import java.util.Scanner;

public class IfElseifTest {
    public static void main(String[] args) {
        // 단 점수는 0~100점 사이값으로 입력받는다
        Scanner scan = new Scanner(System.in);
        System.out.print("너의 점수는?:");
        int score = scan.nextInt();

        if((score>=0)&&(score<=100)) {
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println('B');
            } else if (score >= 70) {
                System.out.println('C');
            } else {
                System.out.println('F');
            }
        } else {
            System.out.println("유효한 점수가 아닙니다");
        }

        scan.close();
    }
}
