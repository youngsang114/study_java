package java기초;

public class ArrayExam {
    public static void main(String[] args) {
        // 아래 char[] 배열에 APPLE이라는 문자가 저장되어 있다. 대문자로 된 APPLE을 소문자 apple로 출력하세요
        char[] c = {'A','P','P','L','E'};
        for(int i=0; i < c.length; i++){
            c[i]=(char)(c[i] +32);
            System.out.print(c[i]);
        }
    }
}
