package fc_java.part3;

import fc_java.model.AllStatic;

public class AllStaticTest {
    public static void main(String[] args) {
        System.out.println(AllStatic.hap(3,9));
        System.out.println(AllStatic.max(25,23));
        System.out.println(AllStatic.min(123,-8));

        // java에서 Math라는 API를 이용할 수 있음
        // 자주 사용하는 기능이기에...
        // Math 또한 private으로 생성자가 만들어지고 모든 메소드 또한 static이다
        System.out.println(Math.max(25,61));
        System.out.println(Math.min(14,10));
    }
}
