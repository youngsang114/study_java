package fc_java.model2;

public class MySQLDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("ulr, username, password 정보를 이용하여 MySQL DB를 접속 시도한다");
    }
}
