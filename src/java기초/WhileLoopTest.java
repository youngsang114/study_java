package java기초;

public class WhileLoopTest {
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5,6,7,8,9,10};

        int i=0; //초기식
        while(i<numbers.length){ // 조건식
            System.out.println(numbers[i]);
            i++; // 증감식
        }
        // do while문!
        i=1;
        do {
            System.out.println(i);
            i++;
        }while(i<=5);
    }
}
