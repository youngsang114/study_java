package yalc_java.sec07.chap01.ex02;

public class Click {
    int x;
    int y;
    int timestamp;

    public Click(int x, int y, int timestamp) {
        this.x = x;
        this.y = y;
        this.timestamp = timestamp;
    }

    //  ⭐️ 아래를 주석해제하고 다시 실행해 볼 것
    // Object의 메소드를 오버라이드 했기때문에 -> 인자로 Object 자료형을 받아야한다
      @Override
      public boolean equals(Object obj) {
          if (!(obj instanceof Click)) return false;
          return this.x == ((Click) obj).x && this.y == ((Click) obj).y;
      }
}
