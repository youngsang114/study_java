package fc_java.model;

public class Dog extends Animal{
    public Dog(){
        super(); // 항상 super는 생성자의 첫 머리에 와야된다 - > 상속 체이닝 때문에
    }
    //Override
    @Override
    public void eat() {
        System.out.println("개처럼 먹다");
    }
}
