package fc_java.poly;

public class Dog extends Animal {
    // Override를 하지 않음 --> 오류가 난다(Animal이라는 추상 클래스 안에 eat이라는 추상 메서드가 잇기 때문에 반드시 재정의를 해줘야 한다)
    // 재정의(Override)를 꼭해줘야한다
    // 다형성이 보장된다
    // [추상 클래스(abstract class)]는 [다형성을] [보장]하는 방법이다
    @Override
    public void eat() {
        System.out.println("개처럼 먹다");
    }
}
