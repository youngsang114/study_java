package fc_java.model2;
// OracleDriver는 Oracle회사에서 만들어서 제공하면 된다(Driver)
public class OracleDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        // 여기서 실제적으로 구현이 되어있다...
        System.out.println("ulr, username, password 정보를 이용하여 oracle DB를 접속 시도한다");
    }
}
