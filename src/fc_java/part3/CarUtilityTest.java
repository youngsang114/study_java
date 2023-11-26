package fc_java.part3;

import fc_java.model.CarDTO;
import fc_java.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        // Car 정보를 출력하는 동작을 가지고 있는 Utility 클래스를 설계하시오
        int carSn=1110;
        String carName ="BMW520i";
        int carPrice =23452352;
        String carOwner ="yys";
        int carYear =2023;
        String carType ="G";

        // 데이터를 묶는다 -> 객체로 (이동의 편리성)
        CarDTO dto = new CarDTO();
        dto.carSn= carSn;
        dto.carName= carName;
        dto.carPrice= carPrice;
        dto.carOwner= carOwner;
        dto.carYear= carYear;
        dto.carType =carType;

        // CarUtility라는 클래스를 만들고, 이를 인스턴스 생성 후, 메서드 carPrint를 호출한다
        CarUtility carUtil = new CarUtility();
        carUtil.carPrint(dto);
        // 이렇게 메서드들을 다른 클래스(CarUtility)로 저장해놓으면 메인 메서드도 가벼워지고,
        // 다른 클래스에서도 호출해서 그 메서드를 이용할 수 있어서 유지 보수가 좋아진다
    }
}
