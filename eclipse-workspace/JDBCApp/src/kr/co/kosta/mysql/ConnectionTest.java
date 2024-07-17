package kr.co.kosta.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            // JDBC Driver 등록
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 연결하기
            conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/jdbc",
                    "kosta",
                    "pass123#");

            System.out.println("연결 성공");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                //  연결끊기
                try {
                    conn.close();
                    System.out.println("연결 끊기");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
