package fc_java.part3;

import fc_java.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        // 생성자 메서드를 통해 personVO객체에 원하는 이름 , 나이, 전화번호를 저장하고 toString() 메서드로 출력하시오
        PersonVO vo= new PersonVO("홍길동",34,"01023452452");
        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());
        // toString 메서드를 만들고 더 쉽게 사용할 수 있다
        System.out.println(vo.toString()); // toString 생략 가능(메소드 만들어놨다면)
        System.out.println(vo); // 객체가 가지고 있는 전체 데이터를 출력하라고 인식하고 [[toString]이라는 메소드를] 찾게 된다
    }
}
