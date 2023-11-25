package java기초;

public class ApiOverloading {
    public static void main(String[] args) {
        int max = maxValue(7,9);
        System.out.println("max = " + max);
        int min = minValue(3,8);
        System.out.println("min = " + min);

    }
    // 두 개의 정수를 매개변수로 받아서 더 큰수를 리턴하는 메서드를 정의하시오
    public static int maxValue(int a, int b){
        return (a>b) ? a : b;

    }
    public static int minValue(int a, int b){
        return (a<b) ? a : b;
    }

}
