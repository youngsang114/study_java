package yalc_java.sec11.chap02;

public class Ex01 {
    public static void main(String[] args) {
        Thread tarzanThread = new Thread(new TarzanRun(100));
        //Thread안에 TarzanRun을 넣고, start를 실행

        //  💡 [쓰레드에] [이름 붙이기] -> setName()
        tarzanThread.setName("타잔송");

        tarzanThread.start();
    }
}
