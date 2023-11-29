package fc_java.part4;

import fc_java.model.Animal;
import fc_java.model.Cat;
import fc_java.model.Dog;

public class PolyTest {
    public static void main(String[] args) {
        // Upcasting으로 객체 생성
        // 상속관계, 재정의(Override), 동적 바인딩

        // [다형성 이론](message polymorphism)
        // 이렇게 [상위 클래스]가 [동일한 메시지] eat()로 [하위 클래스들]에게 [서로 다르게 동작] 시키는 객제 지향이론을
        // [다형성] 이라고 한다
        Animal ani = new Dog();
        ani.eat(); // [실행 시점에] 사용될 메서드가 결정되는 바인딩을 [동적 바인딩] 이라고 한다

        ani= new Cat();
        ani.eat();
//        ani.night();
        ((Cat)ani).night(); // 명시적 형변환, 다운 캐스팅
        // Overloading(오버로딩) : 정적 바인딩 = 컴파일 시점에서 사용될 메서드가 결정되는 바인딩
        // -> 프로그램의 실행 속도와는 무관
        // Override (재정의)     : 동적 바인딩 = 실행시점(런타임)에서 사용될 메서드가 결정되는 바인딩
        // -> 프로그램의 실행 속도와 관련 있다
    }
}
