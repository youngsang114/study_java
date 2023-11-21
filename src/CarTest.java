public class CarTest {
    public static void main(String[] args) {
        // 자동차의 정보를 저장 하려고 한다 변수를 만들어 보시요.
        // 초기화까지 한번에
        String model = "BMW528i"; //문자열은 API에서 String.java.lang
        System.out.println("model = " + model);
        long distance = 10000L; // 정수는 기본 int로 인식(4byte ->2의 32승) -> 맨 뒤에 L을 붙여줘야 한다.
        System.out.println("distance = " +distance + "km");
        long price = 90000000L;
        System.out.println("price = " + price);
        String company = "BMW";
        System.out.println("company = " + company);
        char type = 'A';
        System.out.println("type = " + type);
        boolean auto = true;
        System.out.println("auto = " + auto);
        int year = 2010;
        System.out.println("year = " + year);
        float gasmi = 12.5f; // 실수는 기본 double로 인식(8byte -> 2의 64승) ->맨 뒤에 f를 붙여줘야 한다.
        System.out.println("gasmi = " + gasmi);

    }

}
