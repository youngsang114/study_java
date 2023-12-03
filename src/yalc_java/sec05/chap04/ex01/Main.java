package yalc_java.sec05.chap04.ex01;

public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        String pb = phone.powerButton;
        String ss = phone.sdCardSlot;
//        String cu = phone.cpu; // ⚠️ 불가
        // pivate -> 접근 불가!, [오직 해당 클래스 내]에서만 접근 가능하다
        // default -> 같은 패키지 내에서만 가능
        // protected -> 같은 패키지 or 자손 클래스
        // public -> 다 가능
    }
}
