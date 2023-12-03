package yalc_java.sec05.chap03.ex03;

public class Main {
    public static void main(String[] args) {
        Button button1 = new Button('1', 1);
        Button buttonPlus = new Button('+', 3);
        Button buttonClear = new Button('C', 2);

        Button[] buttons = {button1, buttonPlus, buttonClear};

        System.out.println(Button.mode);
        for (Button button : buttons) { button.place(); }

        //  연속으로 붙여넣어 실행해볼 것
        Button.switchMode(); // -> 클래스 메소드 실행(클래스명.static메소드명()), 객체 생성 X

        System.out.println(Button.mode);
        for (Button button : buttons) { button.place(); }
    }
}
