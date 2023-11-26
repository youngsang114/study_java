package fc_java.model;

public class CarDAO {
    // C,R,U,D
    // Creat = insert(저장)
    public void carInsert(CarDTO car){
        // DB 연결 , insert SQL
        System.out.println("car정보가 DB에 저장 되었습니다");
    }
    public void carSelect(){
        //DB연결, select SQL
        System.out.println("car정보가 출력 되었습니다.");
    }
}
