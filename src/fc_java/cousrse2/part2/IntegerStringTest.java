package fc_java.cousrse2.part2;

public class IntegerStringTest {
    public static void main(String[] args) {
        String str = "123";
        String str2 = "234";
        int str_num = Integer.parseInt(str);
        System.out.println("num = " + str_num);
        int str_sum = Integer.parseInt(str) + Integer.parseInt(str2);
        System.out.println("str_sum = " + str_sum);

        int num = 123;
        String num_st = String.valueOf(num);
        System.out.println("num_st = " + num_st);

        String num_str = ""+ 234;
        System.out.println("num_str = " + num_str);

        System.out.println(String.valueOf(num)+String.valueOf("876"));
    }
}
