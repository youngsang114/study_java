package fc_java.part3;
import fc_java.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("자동차일년번호:");
        int carSn=scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 이름:");
        String carName = scan.nextLine();

        System.out.print("자동차가격:");
        int carPrice=scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 소유자:");
        String carOwner = scan.nextLine();

        System.out.print("자동차 년식:");
        int carYear = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 타입:"); // G(휘발유), D(경유)
        String carType = scan.nextLine();
        scan.close();


        CarDTO car = new CarDTO(); // data를 하나로 묶기 -> DTO필요
        car.carSn= carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;
        car.carType=carType;


        carInfoPrint(car);
    }
    // 매개변수로 자동차의 정보를 받아서 / 출력하는 / 메서드를 정의하시오
    // DTO를 이용하지 않고 하나하나 받았다면 carInfoPrint 메서드의 매개변수가 많아져서 보기 힘들다..
    // 매개변수의 수가 더 늘면 복잡..! -> DTO,VO를 이용해서 하나의 객체(주소)로 전달
    public static void carInfoPrint(CarDTO car){
        System.out.println(car.carSn+"\t"+car.carName+"\t"+car.carPrice+"\t"+car.carOwner+"\t"+car.carYear+"\t"+car.carType);
    }
}
