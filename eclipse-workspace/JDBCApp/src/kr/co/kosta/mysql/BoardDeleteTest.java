package kr.co.kosta.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDeleteTest {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            //JDBC Driver 등록
            Class.forName("com.mysql.cj.jdbc.Driver");

            //연결하기
            conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/jdbc",
                    "kosta",
                    "pass123#"
            );

            //매개변수화된 SQL문 작성
            String sql = "DELETE FROM jdbc.boards WHERE bwriter=?";

            //PreparedStatement 객체 얻기(생성)
            PreparedStatement pstmt = conn.prepareStatement(sql);
            //값 지정
            pstmt.setString(1, "kosta1");

            //SQL문 실행
            int rows = pstmt.executeUpdate();
            System.out.println("삭제된 행 수 : " + rows);

            //PreparedStatement 닫기
            pstmt.close();


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
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
