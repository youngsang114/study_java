package fc_java.part4;

import fc_java.poly.Radio;
import fc_java.poly.RemoCon;
import fc_java.poly.TV;

public class InterfaceTest {
    public static void main(String[] args) {
        // 리모컨으로 Radion와 TV를 동작시켜보자
        // 다항성이 100%보장이 된다.
        // 부모가 인터페이스이면 자식의 내부 동작방식을 전혀 몰라도, 동작을 시킬 수가 있다.
        // 인터페이스 자기자신은 객체를 생성할 수 없다  -> 구현 메소드가 없기 때문에!
        // RemoCon remo = new RemoCon()
        // 부모의 역할을 할 수 있다(다항성을 보장하기 위해서)

        RemoCon remo =new Radio();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();
        System.out.println("-------------------");
        remo = new TV();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();
    }
}
