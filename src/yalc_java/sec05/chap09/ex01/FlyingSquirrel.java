package yalc_java.sec05.chap09.ex01;

public class FlyingSquirrel extends Mamal implements Flyer{
    public FlyingSquirrel(boolean hibernation) {
        super(false);
    }

    @Override
    public void fly() {
        System.out.println("다람쥐를 향해 폴짝");
    }
}
