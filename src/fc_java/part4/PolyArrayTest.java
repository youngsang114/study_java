package fc_java.part4;

import fc_java.model.Animal;
import fc_java.model.Cat;
import fc_java.model.Dog;

public class PolyArrayTest {
    public static void main(String[] args) {
        Dog d =new Dog();
        Cat c =new Cat();

        // [다형성 배열]
        Animal[] ani = new Animal[3];
        ani[0]=d;
        ani[1]=c;
        ani[2]= new Cat();

        display(ani);

    }
    public static void display(Animal[] ani){
        for (int i=0; i< ani.length; i++){
            ani[i].eat();
            if (ani[i] instanceof Cat){
                ((Cat)ani[i]).night();
            }
        }
    }
}
