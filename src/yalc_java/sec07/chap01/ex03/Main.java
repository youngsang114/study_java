package yalc_java.sec07.chap01.ex03;

public class Main {
    public static void main(String[] args) {
        Click click1 = new Click(123, 456, 5323487);
        Click click2 = new Click(123, 456, 5323487);
        Click click3 = new Click(123, 456, 2693702);
        Click click4 = new Click(234, 567, 93827345);

        int click1Hash = click1.hashCode();
        int click2Hash = click2.hashCode();
        int click3Hash = click3.hashCode();
        int click4Hash = click4.hashCode();

        //  💡 Object의 toString은 내부에 hashCode 메소드 사용
        //  hash코드를 오버라이드하면 기본 toString에도 영향
        // return getClass().getName() + "@" + Integer.toHexString(hashCode())
        String click1str = click1.toString();
        String click2str = click2.toString();
        String click3str = click3.toString();
        String click4str = click4.toString();

        System.out.println("--------------------");

        // 문자열은 [리터럴 메모리 영역]에 [인스턴스]가 [생성]된다
        // 문자열이 같은면 같은 인스턴스 주소를 가르킨다
        // 우리가 str1,2,3같이 String을 new 연산자를 이용해 인스턴스를 생성하면, 이는 heap메모리에 올라간다
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = new String("World");
        // heap 메모리에 new 연산자로 생성되어서 두개의 주소값이 다르다
        // == 은 주소값을 비교하고
        // euqls() 는 안의 값(해쉬값 -> 문자열에선 내용이 같으면 같다)를 비교한다
        boolean bool = str1 == str2;

        //  ⭐️ String 클래스 : 문자열 값이 같으면 해시값도 같도록 오버라이드 되어 있음
        int str1Hash = str1.hashCode();
        int str2Hash = str2.hashCode();
        int str3Hash = str3.hashCode();

        //  toString, equals 등도 오버라이드 되어 있음 확인
        String str1ToStr = str1.toString();
        boolean str1eq2 = str1.equals(str2);
    }
}
