package yalc_java.sec05.chap09.ex02;

public interface FoodSafety {
    //  ⭐️
    //  static 제거해 볼 것
    //  static abstract는 역시 불가 (추상 클래스처럼)
    static void announcement () {
        System.out.println("식품안전 관련 공지");
    }

    //  ⭐️
    //  default 제거해 볼 것 -> 구상 메서드
    // default는 분명 추상 메서드만 가능하다고 했었는데..???
    // [default를 붙이면] [구상 메서드]도 [인터페이스] [안]에서 사용이 [가능]하다!
    default void regularInspection () {
        System.out.println("정기 체크");
    }
    // 추상 메서드 두개!
    void cleanKitchen ();
    void employeeEducation ();
}
