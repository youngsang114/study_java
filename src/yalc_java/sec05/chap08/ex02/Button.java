package yalc_java.sec05.chap08.ex02;

public class Button extends FormElement {
    private String print;
    // 추가적으로 버튼에 적혀있는 글씨 -> 필드에 존재

    public Button(int space, String print) {
        super(space);
        this.print = print;
    }

    @Override
    void func() {
        System.out.println(print + "입력 적용");
    }
}
