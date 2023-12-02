package fc_java.cousrse2.part2;

import fc_java.model2.StringOperation;

public class LambdaApply {
    public static void main(String[] args) {
        StringOperation toUpperCase = (String s)->{return s.toUpperCase();};
        StringOperation toLowerCase = s-> s.toLowerCase();

//        System.out.println(toLowerCase.apply("Hello World"));
//        System.out.println(toUpperCase.apply("Hello World"));
        String input_String = "Hello World!";
        System.out.println(processString(input_String,toLowerCase));
        System.out.println(processString(input_String,toUpperCase));
    }
    public static String processString(String input, StringOperation operation){
        return operation.apply(input);
    }
}
