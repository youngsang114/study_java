public class CharTest {
    public static void main(String[] args) {
        // ‘가’라는 한글 한 문자를 변수에 저장하고 출력하시요
        char c='A';
        System.out.println("c = " + c); //A
        int a= 'A';
        System.out.println("a = " + a);

        //. 대문자 ‘A’를 문자 ‘a’로 변환하여 출력하시요.(ASCII코드 참고)

        char upper = 'A';
        char lower = (char) (upper+32);
        System.out.println("lower = " + lower);

        char han ='가';
        System.out.println("han = " + han);
        int hanD ='가';
        System.out.println("hanD = " + hanD);
        int hanU ='\uAC00';
        System.out.println("hanU = " + hanU);
        System.out.println("hanU = " +(char)hanU);


        // ‘1’+’2’=3이 나오도록 프로그래밍 하시요.
        // 0 =48
        char i='1'; //49
        char j='2'; //50
        int sum = (i-'0') + (j-'0');
        System.out.println("sum = " + sum);

        // ‘1’+’2’+’3’+’4’+’5’=15이 나오도록 프로그래밍 하시요.

        char _a = '1';
        char _b = '2';
        char _c = '3';
        char _d = '4';
        char _e = '5';
        int _sum =(_a-'0')+(_b-'0')+(_c-'0')+(_d-'0')+(_e-'0');
        System.out.println("_sum = " + _sum);



    }
}
