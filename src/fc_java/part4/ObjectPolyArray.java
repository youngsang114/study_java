package fc_java.part4;

import fc_java.poly.*;

public class ObjectPolyArray {
    public static void main(String[] args) {
        // A,B 클래스를 저장할 배열을 생성하세요
        // 다형성 배열
        Object[] obj = new Object[2];
        obj[0] = new A(); // upcasting
        obj[1] = new B(); // upcasting -> object에서 upcasting했으면 downcasting을 하게 되어있다

        // 1. 그냥 출력
//        ((A)obj[0]).printGo();
//        ((B)obj[1]).printGo();
        // 2. for문을 이용해 출력
//        for (int i=0; i< obj.length;i++){
//            if (obj[i] instanceof A){
//                ((A)obj[i]).printGo();
//            }else ((B)obj[i]).printGo();
//        }
        // 3. 메서드 display를 만들어서 사용
        display(obj);

    }
    public static void display(Object[] obj){
        for (int i=0; i< obj.length;i++){
            if (obj[i] instanceof A){
                ((A)obj[i]).printGo();
            }else ((B)obj[i]).printGo();
        }
    }
}
