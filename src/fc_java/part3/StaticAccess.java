package fc_java.part3;

import fc_java.model.MyUtil;

public class StaticAccess {
    public static void main(String[] args) {
        int a=10;
        int b=25;
        // MyUtil이라는 클래스를 이용해서 a,b의 합을 구하기!
        int sum = MyUtil.hap(a,b);
        // 클래스(정적) 메서드 사용방법 !
        // MyUtil 클래스를 사용하는 순간, Method Area의 static-zone에 자동으로 메모리 할당
        // 사용방법 -> 클래스명.사용할 메서드명
        System.out.println("sum = " + sum);
    }
}
