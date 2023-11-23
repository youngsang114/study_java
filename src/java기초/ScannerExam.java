package java기초;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //in에 커서 대면, java.io.InputStream인거 알 수 있다
        System.out.print("제목:");
        String title = scanner.nextLine();
        System.out.println("title = " + title);

        System.out.print("가격:");
        int price = scanner.nextInt();  //3000 + enter가 있어서 버퍼 비우기 필요
        System.out.println("price = " + price);

        scanner.nextLine();

        System.out.print("출판사:");
        String company = scanner.nextLine();
        System.out.println("company = " + company);

        System.out.print("저자:");
        String author = scanner.nextLine();
        System.out.println("author = " + author);

        System.out.print("페이지수:");
        int page = scanner.nextInt();
        System.out.println("page = " + page);

        scanner.nextLine();

        System.out.print("isbn:");
        String isbn = scanner.nextLine();
        System.out.println("isbn = " + isbn);

        scanner.close();


    }
}
