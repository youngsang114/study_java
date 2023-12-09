package fc_java.cousrse2.part3;

import com.google.gson.Gson;
import fc_java.Model3.Address;
import fc_java.Model3.Person;

public class GsonMemAddtoJson {
    public static void main(String[] args) {
        Address address = new Address("서울","대한민국");
        Person member = new Person("홍길동",30,"abc@naver.com",address);
        Gson gson = new Gson();
        String json = gson.toJson(member);
        System.out.println("json = " + json.toString());
    }
}
