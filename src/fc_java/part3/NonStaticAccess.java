package fc_java.part3;

import fc_java.model.MyUtil;
import fc_java.model.MyUtil1;

public class NonStaticAccess {
    public static void main(String[] args) {
        int a=7;
        int b=14;
        // MyUtil1에서 호출
//        int sum = MyUtil1.hap(a,b); //non-static 클래스의 메서드를 static 클래스의 메서드로 가져올 수 없다
        // 그래서 우리는 new를 이용해서 heap 메모리에 인스턴스를 생성해야 한다
        MyUtil1 mu = new MyUtil1();
        int sum = mu.hap(a,b);
        System.out.println("sum = " + sum);
    }
}
