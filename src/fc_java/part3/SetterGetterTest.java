package fc_java.part3;

import fc_java.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        // setter, getter 메서드를 통해 PersonVO 객체에 이름,나이, 전화번호를 저장하고 출력하시오
        PersonVO person = new PersonVO();
        person.setAge(23);
        person.setName("yys");
        person.setPhone("01022223333");
        System.out.println(person.getName()+"\t"+person.getAge()+"\t"+person.getPhone());

    }
}
