package fc_java.part3;

public class NonStaticTest {
    public static void main(String[] args) {
        int a=10;
        int b=20;
//        int sum= hap(a,b); // static 메서드에서는 non static 메서드를 수행할 수 없다
        NonStaticTest st= new NonStaticTest();
        // no static메서드인 hap메서드를 사용하기 위해서 객체를 heap 메모리에 생성
        // 이때 NonStaticTest의 객체를 생성할때 main 메서드는 생성되지 않는다 -> static은 딱 한번만 static zone에 메모리가 할당 된다
        int sum= st.hap(a,b);
        System.out.println("sum = " + sum);

    }
    public int hap(int a, int b){
        int v=a+b;
        return v;
    }
}
