package fc_java.part4;

public class RempVO extends Employee{
    public RempVO(){
        super(); // 인자의 아무 것도 업는 부모의 생성자를 호출
    }
    public RempVO(String name,int age,String phone, String empDate, String dept, boolean marriage){
        // 초기화(자식이 부모의 기억공간에 초기화를 하는 경우...)
        // 자식 클래스에서 부모 클래스의 맴베 변수를 마음대로 접근... -> 정보은닉에 위배
        // 부모의 맴버 변수의 접근 제어자가 protected라서 그럼... -> private로???
        super(name,age,phone,empDate,dept,marriage);
        // 부모의 생성자를 호출
    }

}
