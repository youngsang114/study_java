package fc_java.cousrse2.part1;

import fc_java.model2.Connection;
import fc_java.model2.MySQLDriver;
import fc_java.model2.OracleDriver;

public class DataBaseConnection {
    public static void main(String[] args) {
        // oracle DB 접속
        Connection conn = new OracleDriver();
        conn.getConnection("jdbc:oracle:thin:@localhost:1521:DBNAME","name","password");
        // mySQL에 접속
        conn = new MySQLDriver();
        conn.getConnection("jdbc:mysql://localhost:3306/DBNAME","name","password");
        // MSSQL에 접속
        conn = new MySQLDriver();
        conn.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=DBNAME","name","password");
    }
}
