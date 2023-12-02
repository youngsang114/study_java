package fc_java.cousrse2.part2;

import fc_java.model2.IntArray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StringAPITest {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        /*int even =0;
        for (int i: numbers){
            if (i %2 ==0){
                even+=i;
            }
        }
        System.out.println(even);*/

//        IntStream stream=Arrays.stream(numbers);
        int sumOfEvens=Arrays.stream(numbers)
                .filter(n ->n%2==0) // 람다식
                .sum();
        System.out.println("sumOfEvens = " + sumOfEvens);

        int[] evenNumbers=Arrays.stream(numbers)
                .filter(n->n%2==0)
                .toArray();
        for (int i : evenNumbers){
            System.out.print(i+"\t");
        }
    }
}
