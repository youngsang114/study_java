package fc_java.cousrse2.part1;

public class StringManipulation {
    public static void main(String[] args) {
        // Hello World라는 문자열을 생성하세요
        String str = "HelloWorld";
        char firstChar = str.charAt(0);
        String replacedString = str.replaceAll("o", "X");
        int index = str.indexOf("W");
        int length = str.length();
        String upperCase = str.toUpperCase();
        String lowerCase = str.toLowerCase();
        String substring = str.substring(5);

        System.out.println(firstChar);
        System.out.println(replacedString);
        System.out.println(index);
        System.out.println(length);
        System.out.println(upperCase);
        System.out.println(lowerCase);
        System.out.println(substring);
        for (int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }

    }
}
