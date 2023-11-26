package fc_java.part2;

public class CallByReference {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,15};
        int result=addArray(a);  // 번지(주소)값을 전달(Call By Reference)
        System.out.println("result = " + result);

    }
    public static int addArray(int[] a){
        int sum=0;
        for (int j : a) sum += j;
        return sum;
    }
}
