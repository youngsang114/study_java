package fc_java.part2;

import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // System.in -> 키보드로 입력 받는다
        System.out.print("정수를 입력하세요:");
        int num = scan.nextInt(); // 프로그램이 블럭상태가 된다 -> 키보드로부터 데이터를 입력 받아야 한다.
        System.out.println("num = " + num);

        System.out.print("실수를 입력하세요:");
        float f = scan.nextFloat();
        System.out.println("f = " + f);

        System.out.print("문자열을 입력하세요"); //"A","ABC"
        String str = scan.next(); // 공백 앞까지 입력 받음
        System.out.println("str = " + str);

        scan.nextLine(); // 버퍼 비우기 (스트림 비우기)

        System.out.print("문자열을 입력하세요"); //"A","ABC"
        String str2 = scan.nextLine(); // 엔터 앞까지 입력 받음 // 위에 world가 남아 있음
        System.out.println("str = " + str2);

        scan.close(); //키보드의 연결 끊어짐 -> 스트림 초기화
    }

}
