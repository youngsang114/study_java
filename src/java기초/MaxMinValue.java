package java기초;

public class MaxMinValue {
    public static void main(String[] args) {
        // 삼 항 연산자를 이용하여 정수 2개중 max value와 min value를 출력하세요

        int a=10;
        int b=20;
        int min=(a<b) ? a : b;
        System.out.println("min = " + min);

        int max=(a>b) ?a :b;
        System.out.println("max = " + max);
    }
}
