package fc_java.cousrse2.part1;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
//        String str = "Hello,World,Java";
//// 쉼표를 구분자로 사용하여 문자열을 분리합니다.
//        String[] strArray = str.split(",");
//        for (String s : strArray) {
//            System.out.println(s);
//        }
//        String str1 = "Hello World Java";
//        // 정규표현식을 사용하여 공백을 구분자로 사용합니다.
//        //    /s+:하나이상의 공백 문자
//        // 문자열안에서 적기 때문에 \\s+로 적는다
//        String[] strArray1 = str.split("\\s+");
//        for (String s : strArray1) {
//            System.out.println(s);

        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요");
        String str = scanner.nextLine();
        String[] strArray = str.split("\\s+");
        for (String s : strArray){
            System.out.println(s.toString());
        }
        scanner.close();


    }
}
