package fc_java.cousrse2.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","cherry","orrange");

        List<String> upperCasedWords = words.stream()
                .map(word-> word.toUpperCase())
                .collect(Collectors.toList());
        for (String str : upperCasedWords){
            System.out.print(str+"\t");
        }
    }
}
