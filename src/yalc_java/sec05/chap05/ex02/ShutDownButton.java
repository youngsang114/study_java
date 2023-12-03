package yalc_java.sec05.chap05.ex02;

public class ShutDownButton extends Button {
    public ShutDownButton () {
        super("ShutDown"); // 💡 부모의 생성자 호출
        // super가 생성자 안: 부모의 생성자 호출
        // super("ShutDown") = Button("ShutDown")
    }

    //  💡 부모의 메소드를 override
    @Override
    public void func () {
        System.out.println("프로그램 종료");
    }
}
