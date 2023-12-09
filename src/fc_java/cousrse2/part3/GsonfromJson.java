package fc_java.cousrse2.part3;

import com.google.gson.Gson;
import fc_java.Model3.Member;

public class GsonfromJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"홍길동\",\"age\":30,\"email\":\"bit@naver.com\"}";

        Gson gson = new Gson();
        // gson.fromJson(넣을 값, 어떤 Object로 바꿀지 자료형.class) -> 일치하는 값끼리 자동으로 json이 바뀐다
        // Json -> Member(Objcet)
        Member mbr =gson.fromJson(json,Member.class);
        System.out.println("mbr = " + mbr.toString());

    }
}
