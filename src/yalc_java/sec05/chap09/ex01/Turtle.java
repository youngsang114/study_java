package yalc_java.sec05.chap09.ex01;

public class Turtle extends Reptile implements Swimmer{
    @Override
    public void swim() {
        System.out.println("느릿느릿 수영중");
    }
}
