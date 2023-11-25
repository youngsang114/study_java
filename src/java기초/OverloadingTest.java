package java기초;

public class OverloadingTest {
    public static void main(String[] args) {
        float v =add(12.3f,23.5f);
        System.out.println("v = " + v);

        int s =add(3,5);
        System.out.println("s = " + s);
    }
    public static int add(int a, int b){
        int sum =a+b;
        return sum;
    }
    public static float add(float a, float b){
        float sum =a+b;
        return sum;
    }
}
