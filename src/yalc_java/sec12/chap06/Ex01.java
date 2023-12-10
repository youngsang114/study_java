package yalc_java.sec12.chap06;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex01 {
    public static void main(String[] args) throws MalformedURLException {
        //  ⭐️ 예외를 던짐. 여기에서는 main에 넘기기
        URL url1 = new URL("https://showcases.yalco.kr/java/index.html");

        URL url2 = new URL("https://showcases.yalco.kr");
        URL url3 = new URL(url2, "/java/index.html");

        String url1Str = url1.toExternalForm();
        String url3Str = url3.toExternalForm();
        boolean sameUrl = url1.equals(url3);
    }
}
