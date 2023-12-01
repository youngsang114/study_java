package fc_java.model2;

public class MSSQLDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("ulr, username, password 정보를 이용하여 MsSQL DB를 접속 시도한다");
    }
}

