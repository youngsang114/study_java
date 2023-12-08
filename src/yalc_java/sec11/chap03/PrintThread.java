package yalc_java.sec11.chap03;

public class PrintThread implements Runnable {
    // Runnable을 implements 하니까 생성될 Thread에 인자값으로 들어갈 -> PrintThread이다
    static int lastNo = 0;
    String groupName;
    int no;

    public PrintThread(String groupName) {
        this.groupName = groupName;
        this.no = ++lastNo;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.printf("[%s] %d%n", groupName, no);
            } catch (InterruptedException e) {
                System.out.printf("🛑 %s 종료%n", groupName);
                return;
            }
        }
    }
}
