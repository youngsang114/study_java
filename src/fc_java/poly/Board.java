package fc_java.poly;

public class Board extends Object{  // Object는 toString()이라는 메소드가 있다
                                    // 우리가 재정의를 하지 않으면 원래 Object의 toString이라는 기능이 써진다
                                    // 객체의 번지를 문자열로 출력하는 메소드
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    // 오버라이드해서 다른 값이 출력된다

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Board{" +
                "title='" + title + '\'' +
                '}';
    }
}
