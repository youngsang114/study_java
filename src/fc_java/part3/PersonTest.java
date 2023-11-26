package fc_java.part3;

public class PersonTest {
    public static void main(String[] args) {
        // Person이라는 데이터를 저장할 변수를 선언.
//        Person p;
        // 객체를 메모리에 생성하고 그 주소를 p라는 변수에 담는다
//        p = new Person(); // 인스턴스 : 메모리의 객체
        Person p = new Person();
        p.name="yys";
        p.age=23;
        p.phone="010-1111-2222";

        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);
        p.play();
        p.eat();
        p.walk();
    }

}
