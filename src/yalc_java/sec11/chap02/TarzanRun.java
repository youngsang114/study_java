package yalc_java.sec11.chap02;

public class TarzanRun implements Runnable {
    int max;
    public TarzanRun(int max) { this.max = max; }

    @Override
    public void run() {
        String lyric = "%s : 타잔이 %d원짜리 팬티를 입고 %d원짜리 칼을 차고 노래를 한다.";

        for (int i = 0; i < max; i++) {

            try {
                Thread.sleep(2000);
                System.out.printf(
                        //Thread의 클래스 메서드(currentTread)로 현재 Thread의 인스턴스를 구하고 이름음 가져온다
                        (lyric) + "%n", Thread.currentThread().getName(),
                        i * 10, (i + 1) * 10
                );
            } catch (InterruptedException e) {
                // 🛑
                System.out.println("네.");
                return;
            }
        }
    }
}