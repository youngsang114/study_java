package fc_java.model;

public class AllStatic {
    private AllStatic(){
        // private으로 생성자를 만들어서 인스턴스를 생성하지 못하게 하였다
        // 그 대신 AllStatic의 모든 메서드들을 static으로 만들어서, 클래스명.메소드명으로 사용할 수 있게 하였다
        // 개발자가 의도적으로 인스턴스를 생성하지 못하게 하는 방법
    }
    public static int hap(int a, int b){
        int v = a+b;
        return v;
    }
    public static int max(int a, int b){
        return (a>b) ? a :b;
    }
    public static int min(int a, int b){
        return (a<b) ? a :b;
    }
}
