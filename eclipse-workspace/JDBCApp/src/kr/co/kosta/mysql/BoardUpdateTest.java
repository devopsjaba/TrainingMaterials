package kr.co.kosta.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardUpdateTest {
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

            //SQL문 작성
            String sql = new StringBuilder()
                    .append("UPDATE jdbc.boards SET ")
                    .append("btitle=?, ")
                    .append("bcontent=?, ")
                    .append("bwriter=?, ")
                    .append("bfilename=? ")
                    .append("WHERE bid=?")
                    .toString();

            //PreparedStatement 객체 얻기(생성)
            PreparedStatement pstmt = conn.prepareStatement(sql);
            //값 지정
            pstmt.setString(1, "비그친 오후");
            pstmt.setString(2, "비구름이 지금은 위로 옮겼습니다");
            pstmt.setString(3, "kosta1");
            pstmt.setString(4, "event.png");
            pstmt.setInt(5, 1);

            //SQL문 실행
            int rows = pstmt.executeUpdate();
            System.out.println("수정된 행 수 : " + rows);

            //PreparedStatement 닫기
            pstmt.close();


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
