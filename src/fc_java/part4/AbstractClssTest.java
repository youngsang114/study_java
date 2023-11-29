package fc_java.part4;

import fc_java.poly.Animal;
import fc_java.poly.Cat;
import fc_java.poly.Dog;

public class AbstractClssTest {
    public static void main(String[] args) {
        // 추상 클래스는 단독으로 객체를 생성할 수 없다.
//        Animal ani = new Animal();
        // 추상 클래스는 부모의 역활을 할 수 있다.
        Animal ani =new Dog();
        ani.eat();
        ani.move();

        ani = new Cat();
        ani.eat();
        ani.move();
        ((Cat)ani).night();
        }
}
