package fc_java.poly;

public interface RemoCon {
    // 인터페이스 = 추상메서드 + final static 상수

    public final static int MAXCH = 99;
    public final static int MINCH = 1;

    public abstract void chUp();
    public abstract void chDown();
    public abstract void volUp();
    public abstract void volDown();
    public void internet();

    // [인터페이스에서는] [구현 메소드는] 정의될 수 없다
    // 대신 100프로 [추상 메소드만] 들어감 -> [abstract] [생략 가능]
//    public void internet(){
//        System.out.println("인터넷이 구현된다");
}

