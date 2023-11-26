package fc_java.part2;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("오늘의 요일을 적어주세요:");
        String day = scan.nextLine();

        switch (day){
            case "Sunday":
                System.out.println("야구하기");
                break;
            case  "Monday":
                System.out.println("농구하기");
                break;
            case  "Tuseday":
            case  "Wednesday":
                System.out.println("수영하기");
                break;
            case "Friday":
            case "Satureday":
                System.out.println("휴식하기");
                break;
            default:
                System.out.println("침대에서 나가지도 않기");

            scan.close();


        }
    }
}
