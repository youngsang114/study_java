package fc_java.part2;

public class ForLoopTest {
    public static void main(String[] args) {
        //반목문을 이용하여 알파벳 대문자와 아스키 코드 값을 출력하세요
        char[] chr= {'A','B','C','I','Z'};
        for (int i=0; i<chr.length; i++){
            System.out.printf("%c\t:\t%d",chr[i],(int)chr[i]);
            System.out.println();
        }

        for(char c='a'; c<='z';c++)
            System.out.println(c+":"+(int)c);

        // int[] numbers = {1,2,3,4,5,6,7,8,9,10}; 배열 원소를 향상된 for문(for-each)문으로 출력하세요
        int[] numbers ={1,2,3,4,5,6,7,8,9,10};
        for (int i:numbers) {
            System.out.println(i);
        }
        // 위 예제를 for문으로 해결하기
        for (int i=0; i<numbers.length; i++){
            System.out.println("for문 이용:"+numbers[i]);
        }
    }





}
