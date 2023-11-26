package fc_java.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;
    public PersonVO(){ // 생성자를 오버로딩 했기 때문에, 기본 생성자를 지우면 초기화된 객체가 생성되지 않는다
        // 객체를 생성하는 코드는 내부에서 만들어진다
        // 객체의 초기화를 한다. 밑에 3줄은 객체 초기화의 예시
//        this.name = "person";
//        this.age =20;
//        this.phone = "000-1234-5678";
    }
    public PersonVO(String name, int age,String phone){
        this.name=name;
        this.age=age;
        this.phone=phone;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }
    public String toString(){
        return name +"\t"+age+"\t"+phone;
    }
}
