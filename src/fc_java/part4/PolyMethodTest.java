package fc_java.part4;

import fc_java.model.Animal;
import fc_java.model.Cat;
import fc_java.model.Dog;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        display(dog);
        display(cat);
    }
    private static void display(Animal ani){// 여러가지 인수 한번에 -> 다형성 인수(부모 타입)를 사용한다
        ani.eat();
        if (ani instanceof Cat){ // instanceof : 타입 확인 연산자 , boolean형태로 반환
            ((Cat)ani).night();
        }
    }
}
