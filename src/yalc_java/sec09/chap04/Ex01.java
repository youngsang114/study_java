package yalc_java.sec09.chap04;

import java.util.*;
import java.util.stream.Collectors;

public class Ex01 {
    public static void main(String[] args) {
        List<Integer> int0To9 = new ArrayList<>(
                Arrays.asList(5, 2, 0, 8, 4, 1, 7, 9, 3, 6)
        );
        //  홀수만 골라낸 다음 정렬하여 "1, 3, 5..."와 같은 문자열로 만들어보기
        List<Integer> odds = new ArrayList<>();
        for (int i =0; i<int0To9.size(); i++){
            if (int0To9.indexOf(i) % 2 ==1){
                odds.add(int0To9.indexOf(i));
            }
        }
        odds.sort(Integer::compare);
//        String str = odds.toString();
        List<String> oddsStrs = new ArrayList<>();
        for (int num:odds) {
            oddsStrs.add(String.valueOf(num));
        }
        String oddsStr = String.join(",",oddsStrs);

        //  ⭐ 스트림을 사용한 방식
        //  각 라인이 무엇을 반환하는지 확인할 것
        String oddsStrStreamed = int0To9
                .stream()
                .filter(i -> i % 2 == 1)
                .sorted(Integer::compare)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
