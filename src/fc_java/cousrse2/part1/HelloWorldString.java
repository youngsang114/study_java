package fc_java.cousrse2.part1;

public class HelloWorldString {
    public static void main(String[] args) {
        // String이 사용자 지정 자료형이므로 객체를 생성해야함
        // new를 이용해 생성하면 -> [Heap memory]에 메모리가 할당됨

        String str = new String("Hello Wrold");
        System.out.println(str.toString());

        // ""안에 넣으면 [Literal Pool] 메모리에 할당됨
        String str1 = "Hello World!";
        System.out.println(str1.toString());
    }
}
