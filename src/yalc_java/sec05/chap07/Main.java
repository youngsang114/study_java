package yalc_java.sec05.chap07;

public class Main {
    public static void main(String[] args) {
        String ycCreed = YalcoChicken.CREED;
//        YalcoChicken.CREED = "우리의 튀김옷은 바삭하다"; // ⚠️ 불가 ->final로선언된 필드는 수정이 불가능하다

        final YalcoChicken store1 = new YalcoChicken(3, "판교");
        // 인스턴스를 담는 변수를 final로 지정, 여기에 다른 값을 넣는 것은 불가능!!!
        //  ⚠️ 불가
//        store1 = new YalcoChicken(17, "강남");
        //  💡 요소 변경은 가능
        store1.name = "선릉";

    }
}
