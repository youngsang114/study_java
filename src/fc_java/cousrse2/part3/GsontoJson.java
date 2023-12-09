package fc_java.cousrse2.part3;

import com.google.gson.Gson;
import fc_java.Model3.Member;

public class GsontoJson {
    public static void main(String[] args) {
        Member mvo = new Member("홍길동",30,"bit@naver.com");
        // Json -> {"name": "홍길동",...}

        // Gson 객체 생성
        // Object(Member) -> Json 형태로 바꾸기
        Gson gson = new Gson();
        String json=gson.toJson(mvo);
        System.out.println("json = " + json);
    }
}
