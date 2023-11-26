package fc_java.part2;

public class Operator {
    public static void main(String[] args) {
        // 두 과목의 점수를 이용하여 총점과 평균을 출력하는 JavaSE프로그램을 만들어보자
        int kor = 77; // 변수 선언 -> 기억공간이 RAM안에 만들어진다
        int eng = 87; // 변수 할당 -> kor,eng에 점수가 할당된다

        System.out.println("총점:"+(kor+eng));
        System.out.printf("평균:%d%n",(kor+eng)/2);

    }
}
