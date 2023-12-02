package fc_java.cousrse2.part2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCompareTest {
    // 특정 객체의 인스턴스 메서드 참조 -> 클래스명 :: 메서드명
    // String클래스의 compareTo를 참조하였다
    // sort의 분류 방법으로 comparTo를 참조한 것!
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동","김길동","라길동");
        Collections.sort(names,String::compareTo);
        System.out.println(names);

        for (String str : names){
            System.out.print(str+"\t");
        }
    }
}
