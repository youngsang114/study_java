package fc_java.part3;

import fc_java.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO dto = new MemberDTO();
        dto.name = "yys";
//        dto.age =22;   -> private으로 접근제어자를 만들었기 때문에, 접근이 불가능 하다
        dto.phone ="01022223333";
        dto.play();
    }
}
