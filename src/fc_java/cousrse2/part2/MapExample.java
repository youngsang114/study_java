package fc_java.cousrse2.part2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> stdScores = new HashMap<>();
        stdScores.put("Kim",95);
        stdScores.put("Lee",85);
        stdScores.put("Park",90);
        stdScores.put("Choi",80);

        System.out.println("Kim's socer: "+stdScores.get("Kim"));
        System.out.println("Lee's socer: "+stdScores.get("Lee"));

        stdScores.put("Choi",100);
        System.out.println("Choi's socer: "+stdScores.get("Choi"));

        stdScores.remove("Park");
        System.out.println("Park's socer: "+stdScores.get("Park")); // null

        System.out.println("----------------");
        for (Map.Entry<String,Integer> entry:stdScores.entrySet()){
            System.out.println(entry.getKey() + "'sscore : "+entry.getValue());
        }
    }
}
