package fc_java.part3;

import fc_java.model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        Student st1; //st1 : Object (st1이 누구인지 구분이 안감)
        Student st2; // 객체를 저장할 변수에 불과함
        Student st3;

        st1 = new Student("홍길동","수학",23,"abc@naver.com",2023,"01022223333"); // st1 : instance (힙 메모리에 객체가 생성되었다)
        st2 = new Student(); // st2 : instance (힙 메모리에 객체가 생성되었다)
        st3 = new Student(); // st2 : instance (힙 메모리에 객체가 생성되었다)

        System.out.println(st1.toString());

    }
}
