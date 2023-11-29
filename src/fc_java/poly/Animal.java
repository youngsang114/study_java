package fc_java.poly;
// 추상 클래스(불완전한 클래스)
public abstract class Animal { // 추상 메서드를 가진 클래스는 추상 클래스가 된다
    public abstract void eat(); // [추상 메서드](불완전한 메서드) : 메서드의 구현부가 없다
    public void move(){         // [구현 메서드]
        System.out.println("무리를 지어서 이동한다");
    }
}
