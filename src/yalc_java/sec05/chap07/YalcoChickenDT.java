package yalc_java.sec05.chap07;

public final class YalcoChickenDT extends YalcoChicken {
    public YalcoChickenDT(int no, String name) {
        super(no, name);
    }

    //  ⚠️ 불가
    // final이 붙은 메서드는 오버라이드 불가능
//    public void fryChicken () {
//        System.out.println("염지, 반죽입히기, 미원, 튀김");
//    }

    // 생성자 추가할 것
}