package fc_java.part3;
// object(객체) = 상태정보(멤버변수)+행위정보(멤버메서드)
public class Person {
    public String name;
    public int age;
    public String phone;
    public Person(){ // 생성자 메서드 (모든 클래스는 기본 생성자를 가지고 있다) - > 생략 가능

    }
    public void play(){
        System.out.println("운동을 한다");
    }
    public void eat(){
        System.out.println("음식을 먹다");
    }
    public void walk(){
        System.out.println("걷다");
    }

}
