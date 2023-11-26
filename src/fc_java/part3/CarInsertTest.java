package fc_java.part3;

import fc_java.model.CarDAO;
import fc_java.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        // 자동차 정보를 키보드로 부터 입력을 받아서 DB에 저장

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

        CarDAO dao =new CarDAO(); // DAO 객체를 생성해서, C,R,U,D를 처리한다
        dao.carInsert(car); // 컨트롤 클릭하면 넘어감 !
        dao.carSelect();
    }
}
