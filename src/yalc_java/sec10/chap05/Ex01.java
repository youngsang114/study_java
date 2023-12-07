package yalc_java.sec10.chap05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        String correctPath = "./src/yalc_java/sec09/chap04/turtle.txt";
        String wrongPath = "./src/yalc_java/sec09/chap04/rabbit.txt";

        openFile1(correctPath);
        openFile1(wrongPath);
    }

    public static void openFile2 (String path) {
        //  ⭐ Scanner가 Closable - AutoClosable를 구현함 확인
        // try문 안에 괄호를 넣고 Scanner을 선언하는 부분을 넣어준다 -> 그러면 Scanner은 try문 안에서 사용
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.printf("⚠️ %s 파일 없음%n", path);
        }
        // 이 시점에서 Scanner은 close되어있음 -> try,catch문이 끝나는 시점에!(이것이 try with resources이다)

        // 💡 .close를 작성하지 않아도 자동으로 호출됨
    }
    public static void openFile1 (String path) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(path));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.printf("⚠️ %s 파일 없음%n", path);
        } finally {
            System.out.println("열었으면 닫아야지 ㅇㅇ");
            if (scanner != null) scanner.close();

            //  💡 만약 이 부분을 작성하는 것을 잊는다면?
        }
    }
}
