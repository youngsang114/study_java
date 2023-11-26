package fc_java.part3;

import fc_java.model.CarDAO;
import fc_java.model.CarDTO;
import java.util.Scanner;
//import java.lang.*  //default package
public class PackageNameTest {
    public static void main(java.lang.String[] args) {
        // 지금까지 java에서 제공해주어서 사용해본 클래스들의 이름을 적어보자
        java.lang.String str ="화이팅";
        java.util.Scanner scan=new Scanner(java.lang.System.in);
        java.lang.System.out.println();
        // 우리가 직접 만들어서 사용해 본 클래스들의 이름을 적어보자
        fc_java.model.CarDTO dto =new CarDTO();
//        dto.carSn =1110; // default는 같은 패키지 안에서만 참조가 가능하다 ->CarDTO의 carSn의 접근 제어자는 default
        fc_java.model.CarDAO dao =new CarDAO();
    }

}
