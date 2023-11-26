package fc_java.part3;

import fc_java.model.PersonVO;

public class ConsuructorOverloading {
    public static void main(String[] args) {
        PersonVO v1= new PersonVO();
        System.out.println(v1.getName()+"\t"+v1.getAge()+"\t"+v1.getPhone());

        System.out.println("-------------------");

        PersonVO v2= new PersonVO("yys",23,"010-1234-5678");
        System.out.println(v2.getName()+"\t"+v2.getAge()+"\t"+v2.getPhone());
    }
}
