package fc_java.part4;

import fc_java.model.Cat;
import fc_java.model.Dog;

public class DogCatTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();

        Cat cat = new Cat();
        cat.eat();
        cat.night();
    }

}
