package yalc_java.sec05.chap09.ex01;

public class Penguin extends Bird implements Hunter,Swimmer{
    @Override
    public void hunt() {
        System.out.println("물고기 줍기");
    }

    @Override
    public void swim() {
        System.out.println("짧은 다리로 수영중");

    }
}
