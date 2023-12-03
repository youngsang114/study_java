package yalc_java.sec05.chap04.ex02;

public class Button {
    // 일반적으로 멤버 변수들을 private
    // 일반적으로 메소드들을  public (내부에서만 쓰면 private으로)
    private static String mode = "LIGHT";
    public static void switchMode () {
        mode = mode.equals("LIGHT") ? "DARK" : "LIGHT";
    }

    private char print;
    private int space=1;

    public Button (char print, int space) {
        this.print = print;
        this.space = space;
    }

    public void setSpace (int space) {
        if (space < 1 || space > 4) return;
        this.space = space;
    }
    public String getButtonInfo () {
        return "%c 버튼, %d픽셀 차지"
                .formatted(print, space * 4096);
    }
}
