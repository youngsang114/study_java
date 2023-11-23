package java기초;

public class BookTest {
    public static void main(String[] args) {
        // [정수] 한 개를 저장할 변수를 [선언] 하시오
        int a;
        // [책] 한 권을 저장할 [변수를 선언] 하시오

        // Book이라는 객체를 클래스를 이용해 모델링!!
//        java기초.Book b; // 변수 선언 -> 기억공간을 만든다 : 이 때 b는 객체 변수이다
        //그런데 변수 b에 object형태인 Book을 담을 수 없다 -> object의 주소(번지)를 변수에 넣어서 변수가 그 주소를 가르키게 해준다
        // 컴퓨터는 object를 메모리 구조로 표현
        Book b = new Book();// 이 때 인스턴스 b를 가르키는 변수 b를 '인스턴스 변수'라고 한다
        b.title="java";
        b.price=30000;
        b.company="fc";
        b.author="yys";
        b.page=700;
        b.isbn="1199110";
    }
}
