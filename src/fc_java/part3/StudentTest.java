package fc_java.part3;

import fc_java.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        // 정수 6개를 저장할 배열을 생산하시오
        int[] arr = new int[6];
        arr[0] = 12;
        arr[1] = 15;
        arr[2] = 75;
        arr[3] = 93;
        arr[4] = 20;
        arr[5] = 91;
        for (int i:arr) System.out.println(i);

        // 잘 설계된 학생 객체를 설계하고 데이터를 저장 후 출력하시오
        Student vo =new Student("yys","math",23,"abc@naver.com",1801,"01011112222");
        System.out.println(vo.toString());

    }
}
