package yalc_java.sec07.chap01.ex04;

public class ShallowCopied implements Cloneable {
    // 얕은 복사 -> 인스턴스 복사할때, 원시 자료형은 다 복사되지만 참조 자료형은 주소가 복사된다...
    String title;
    int no;

    int[] numbers;
    Click click;
    Click[] clicks;

    public ShallowCopied(String title, int no, int[] numbers, Click click, Click[] clicks) {
        this.title = title;
        this.no = no;
        this.numbers = numbers;
        this.click = click;
        this.clicks = clicks;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        //  [Cloneable을 구현]했으므로 정상 동작
        //  - 원시값만 완전히 복사됨
        return super.clone();
    }
}
