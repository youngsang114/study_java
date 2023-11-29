package fc_java.part4;

import fc_java.poly.Animal;
import fc_java.poly.Cat;
import fc_java.poly.Dog;

public class IsNotOverride {
    public static void main(String[] args) {
        // 재정의를 하지 않았기 때문에 부모가 명령을 내리면 오동작을 한다
        // [다형성을 보장하지 않음] -> 재정의를 해야지 다형성을 보장한다
        // 강제로 재정의를 하는 방법은? -> 추상 클래스, 인터페이스 !!!
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();
    }
}
