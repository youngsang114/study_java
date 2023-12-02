package fc_java.cousrse2.part2;

import fc_java.model2.Convertor;
import fc_java.model2.IntegerUtils;

public class IntegerUtilsTest {
    public static void main(String[] args) {
        // 정적 메서드 참조
        // 정적(클래스) IntegerUtils의 메서드 stringToInt를 참조 -> IntegerUtils::stringToInt
        // convertor안의 convert는 IntegerUtil의 stringToInt를 참조한다
        Convertor<String,Integer> convertor = IntegerUtils::stringToInt;
        Integer result = convertor.convert("123");
        System.out.println("result = " + result);
    }
}
