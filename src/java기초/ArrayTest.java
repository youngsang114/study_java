package java기초;

public class ArrayTest {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        // int[] a;
        // a = new int[]{10,20,30,40,50} -> []안에 숫자도 넣으면 안됨! ->{}안에서 초기화 개수가 들어가서 적어주면 중복!!!
        // a = {10,20,30,40,50} -> 이거는 오류가 난다!!!
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        int sum = a[0] + a[3];
        System.out.println("sum = " + sum);
        System.out.println(a.length);

        System.out.println("--------------");
        int[] b =new int[3]; // 빈 배열이라도 기본적으로 크기에 맞게 생기고 모두 0이 들어간다
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
    }
}
