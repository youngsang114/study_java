package fc_java.cousrse2.part1;

import fc_java.model2.BB;
import fc_java.model2.CC;

//CC를 이용하여 BB를 동작시키는 프로그래밍(인터페이스 기반의 프로그래밍)
public class InterfaceAPI {
    public static void main(String[] args) {
        CC c = new BB();
        c.x(); // BB의 x()가 동작 -> 동적 바인딩
        c.y();
        c.z();

    }
}
