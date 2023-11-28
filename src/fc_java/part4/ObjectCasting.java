package fc_java.part4;

import fc_java.model.Animal;
import fc_java.model.Cat;
import fc_java.model.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        // Animal  -> cat,dog
        Animal ani = new Dog(); // 객체 생성법 중 Up casting
        ani.eat();

        ani = new Cat();
        ani.eat();

        // 고양이한테만 있는 night를 쓰려고 함
//        ani.night() // 보모에게는 nigth가 없고 고양이한테만 있음 -> 이럴때 [다운 캐스팅(명시적 형변환)]을 해준다
        ((Cat)ani).night(); // 이렇게 [다운 캐스팅을] 해야지, cat 부분 night 메서드 메모리에 접근이 가능
        // (Cat)ani.night() : 오류 ([참조 연산자 .]이 [캐스팅 연산자]보다 [우선 순위]다)
        // [다운 캐스팅]은 [업 캐스팅]이 되어 있는 [이후]에만 사용 가능
        // 하위 클래스 타입을 정확하게 명시해줘야 한다

    }
}
