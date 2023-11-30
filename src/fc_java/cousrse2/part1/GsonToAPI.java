package fc_java.cousrse2.part1;

import com.google.gson.Gson;
import fc_java.model2.Person;

public class GsonToAPI {
    public static void main(String[] args) {
        Person person =new Person("yys",23);
        Gson gson = new Gson();
        String json=gson.toJson(person);
        System.out.println(json); // {"name":"yys","age":23}

    }
}
