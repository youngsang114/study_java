package fc_java.cousrse2.part2;

public class WrapperTest {
    public static void main(String[] args) {
        // 정수형 변수에 10을 저장하시오
        int a =10; // 기본 자료형
//        Integer aa = new Integer(10); // 사용자 정의 자료형
        Integer aa =10; // Auto-boxing으로 시스템에서 자동으로 해준다
        System.out.println(aa.intValue()); // un - boxing(Integer->tnt)

//        Integer bb = new Integer(20);
        Integer bb = 20; // Auto - boxing
        int b =bb;       // Auto - unboxing

        float f=10.5f;
//        Float ff = new Float(10.5);
        Float ff = 10.5f; // new Float(10.5f); -> Auto-boxing
        System.out.println(ff.floatValue()); // unboxing

        Float af =49.1f; // Auto-boxing
        float aff = af; // Auto-unboxing
        System.out.println(aff);
    }
}
