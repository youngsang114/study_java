package fc_java.cousrse2.part2;

import fc_java.model2.Person;
import fc_java.model2.PersonFactory;

public class PersonFactoryTest {
    public static void main(String[] args) {
        // 생성자 참조 : 클래스명::new

        // 익명 클래스
        /*PersonFactory personFactory = new PersonFactory() {
            @Override
            public Person creat(String name, int age) {
                return new Person(name,age);
            }
        };
        Person person = personFactory.creat("나길동",100);
        System.out.println(person);*/

        PersonFactory personFactory = Person::new;
        Person person = personFactory.creat("yys",23);
        System.out.println(person.toString());
    }
}
