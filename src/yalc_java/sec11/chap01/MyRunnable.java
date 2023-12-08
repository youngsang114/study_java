package yalc_java.sec11.chap01;

public class MyRunnable implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 20; i++) {
            // 😴
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.print(2);
        }
    }
}