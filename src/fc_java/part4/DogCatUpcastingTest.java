package fc_java.part4;

import fc_java.model.Animal;
import fc_java.model.Cat;
import fc_java.model.Dog;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        // Upcasting을 이용해서 자료형을 Animal로 해주기
        // 우리가 코드를 배포할때, 소스코드를 배포하는게 아니라 실행 코드를 배포한다
        // Dog.java(x) , Dog.class(o)로 배포된다
        // 이때 Dog라는 코드의 메소드를 우리가 알지 못하기에, 같이 제공되는 Animal의 소스코드를 보고 메서드를 실행한다
        // Dog 실행코드 : 자식 클래스,텔레비전
        // Animal 소스코드 : 부모 클래스,리모컨(우리가 텔리비젼의 회로도를 몰라도 리모컨만 있아도 조작이 가능하다)
        Animal x = new Dog();
        x.eat();  // Animal---(동적 바인딩) -->Dog

        // x의 자료형은 Animal인데, 실행시점에서는 Dog의 메서드를 실행한다
        // 이를 [동적 바인딩]이라고 한다.
        // 런타임 시점에서, 자식 메서드가 오버라이드 되어있는지 확인하고, 그랬다면 자식 메서드를 이용 부모 메서드는 그림자 취급을 한다.

        Animal y = new Cat();
        y.eat(); // Animal---(동적 바인딩) -->Cat
    }
}
