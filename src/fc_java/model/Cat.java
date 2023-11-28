package fc_java.model;

public class Cat extends Animal{
    public Cat(){
        super();
    }
    //Override
    @Override
    public void eat() {
        System.out.println("고양치럼 먹다");
    }
    public void night(){
        System.out.println("밤에 눈에서 빛이 난다");
    }
}
