package fc_java.part2;

public class BinaryTest {
    public static void main(String[] args) {
        int decimal = 69;
        System.out.println("decimal = " + decimal);
        int binary = 0b01000101;
        System.out.println("binary = " + binary);
        int octal =0105;
        System.out.println("octal = " + octal);
        int hexa = 0x45;
        System.out.println("hexa = " + hexa);

        System.out.println("-----------");

        int decimal2 = 123;
        System.out.println("decimal2 = " + decimal2);
        int binary2 =  0b01111011;
        System.out.println("binary2 = " + binary2);
        int octal2 = 0173;
        System.out.println("octal2 = " + octal2);
        int hexa2 = 0x7B;
        System.out.println("hexa2 = " + hexa2);

        System.out.println("-----------");

        String binary_ = Integer.toBinaryString(decimal2); // 2진수로 바꿔서 문자열로 담아주는 API
        // wrapper형 Integer은 java.lang안에 들어있다
        System.out.println("binary = " + binary_);
        String octal_ = Integer.toOctalString(decimal2);
        System.out.println("octal_ = " + octal_);
        String hexa_ = Integer.toHexString(decimal2);
        System.out.println("hexa_ = " + hexa_);

        int binary3 =  0b10110011;
        System.out.println("binary3 = " + binary3);


    }
}
