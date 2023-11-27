package fc_java.part3;

import fc_java.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        // [객체 배열]을 이용하여 [4명]의 [학생 데이터]를 저장하고 출력하시오
        Student[] std = new Student[4];
        std[0]= new Student("홍길동","수학",23,"abc@naver.com",20230101,"010-1111-2222");
        std[1]= new Student("가길동","컴공",24,"abd@naver.com",20230102,"010-1111-2223");
        std[2]= new Student("나길동","통계",25,"abg@naver.com",20230103,"010-1111-2244");
        std[3]= new Student("다길동","기공",59,"acb@naver.com",20200101,"010-1131-2567");

        for (Student i:std){
            System.out.println(i.toString());
        }
    }
}
