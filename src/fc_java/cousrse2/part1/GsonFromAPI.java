package fc_java.cousrse2.part1;

import com.google.gson.Gson;
import fc_java.model2.Person;

public class GsonFromAPI {
    public static void main(String[] args) {
        String json = "{\"name\":\"yys\",\"age\":23}"; // JSON -> Person
        Gson gson =new Gson();
        Person p = gson.fromJson(json, Person.class);
        System.out.println(p.getName());  // yys
        System.out.println(p.getAge());   // 23
        System.out.println(p.toString());
    }
}
