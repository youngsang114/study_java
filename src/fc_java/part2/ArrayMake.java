package fc_java.part2;

public class ArrayMake {
    public static void main(String[] args) {
        // 정수 5개를 저장 할 배열을 생성 하시오
        int[] a = new int[5]; // 배열은 길이가 고정이된다!

        for(int i=0; i<a.length; i++){
            a[i]=i;
        }
    }
}
