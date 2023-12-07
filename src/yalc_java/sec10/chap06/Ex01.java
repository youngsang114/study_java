package yalc_java.sec10.chap06;

import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {
        String nulStr = null; // null은 컴파일러 선에서 방지되지 않음
//        System.out.println(nulStr.length()); // ⚠️ NPE -> NullPointerException

//        System.out.println(
//                catOrNull().length()  // 반복실행해 볼 것
//        );
        //  try-catch 문으로 NPE에 대비하기
        //  반복실행해 볼 것
        try {
            System.out.println(
                    catOrNull().length()
            );
        } catch (NullPointerException ne) {
            ne.printStackTrace();
            System.out.println(0);
        }
    }
    public static String catOrNull () {
        //  슈뢰딩거의 고양이
        return new Random().nextBoolean() ? "Cat" : null;
    }
}
