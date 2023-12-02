package fc_java.cousrse2.part2;

import fc_java.model2.Convertor;
import fc_java.model2.StringUtils;

public class StringUtilsTest {
    public static void main(String[] args) {
        // 인스턴스 메서드 참조 -> 객체참조::메서드명
        // new를 이용해서 객체를 생성해야한다 ->static이 아니므로 heap메모리에 객체를 할당해줘야함
        StringUtils stringuils = new StringUtils();
        Convertor<String,String> convertor = stringuils::reverse;
        String reverse = convertor.convert("hello");
        System.out.println("reverse = " + reverse);
    }

}
