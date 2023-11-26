package fc_java.part2;

public class FindAPI {
    public static void main(String[] args) {
        int a; // 변수 선언
        a =10;
        System.out.println("a = " + a);

        // java.lang.String s;
        // 자바 기본 제공 Api -> lang 패키지 안에 String이 Api로 제공
        // JDK가 이거를 보고 에러가 안남! -> 자바가 만들어서 제공하는 사용자 정의 자료형을 제공 --> 생략 가능
        String s; // lang 패키지는 자주 사용해서, 안적어줘도 됨
        s ="APPLE";
        System.out.println("s = " + s);
        System.out.println(s.length()); // s가 String이므로 String클래스안의 여러 메소드 이용가능하다!



    }
}
