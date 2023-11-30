package fc_java.cousrse2.part1;

import fc_java.model2.MinMaxFinder;

public class MinMaxFinderTest {
    public static void main(String[] args) {
        int arr[]={1,42,63,88,22,3};
        int min =MinMaxFinder.findMin(arr);
        int max =MinMaxFinder.findMax(arr);

        System.out.println(min);
        System.out.println(max);
    }
}
