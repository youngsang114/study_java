package fc_java.part4;

public class EmployeeTest {
    public static void main(String[] args) {
        // 일반사원 한명의 객체를 생성하고 데이터를 저장후 출력을 하세요.
        RempVO vo =new RempVO("홍길동",23,"010222391412","20200101","홍보",true);

//        System.out.println(vo.name+"\t"+vo.age+"\t"+vo.phone+"\t"+vo.empDate+"\t"+vo.dept+"\t"+vo.marriage);
        System.out.println(vo.toString());
        // 자식이 부모의 상태정보를 마음대로 접근...
        // 정보은닉에 위해 !!!
    }

}
