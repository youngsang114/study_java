package fc_java.cousrse2.part3;

import com.google.gson.Gson;
import fc_java.Model3.Person;

public class GsonMemAddFromJson {
    public static void main(String[] args) {
        String json ="{\"name\":\"홍길동\",\"age\":30,\"email\":\"abc@naver.com\"," +
                "\"address\":{\"city\":\"서울\",\"country\":\"대한민국\"}}";
        Gson gson = new Gson();
        Person member = gson.fromJson(json,Person.class);
        System.out.println("member = " + member.toString());


    }
}
