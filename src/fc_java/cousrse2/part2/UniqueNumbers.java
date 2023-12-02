package fc_java.cousrse2.part2;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] num ={1,2,3,4,2,5,6,7,1,2};
        Set<Integer> uniqueNums = new HashSet<>();

        for (int i:num){
            uniqueNums.add(i);
        }
        int size = uniqueNums.size();

        for (int i : uniqueNums){
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println(size);
    }
}
