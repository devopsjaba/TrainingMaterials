package kr.co.kosta.mysql4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TranasctionTest {

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

            //자동 커밋 기능 끄기
            conn.setAutoCommit(false);

            //출금기능
            String sql = "UPDATE jdbc.accounts SET balance = balance - ? WHERE aid=?";
            PreparedStatement pstmt1 = conn.prepareStatement(sql);
            pstmt1.setInt(1, 10000);
            pstmt1.setString(2, "123-456-1111");
            int rows1 = pstmt1.executeUpdate();
            if (rows1 == 0) throw new Exception("출금되지 않았음");
            pstmt1.close();

            //입금기능
            String sql2 = "UPDATE jdbc.accounts SET balance = balance + ? WHERE aid=?";
            PreparedStatement pstmt2 = conn.prepareStatement(sql2);
            pstmt2.setInt(1, 10000);
            pstmt2.setString(2, "213-432-2220");
            int rows2 = pstmt2.executeUpdate();
            if (rows2 == 0) throw new Exception("입금되지 않았음");
            pstmt2.close();

            //커밋 (모두 성공처리)
            conn.commit();
            System.out.println("계좌 이체 성공!");

        } catch (Exception e) {

            try {
                // 롤백 (모두 실패 처리)
                conn.rollback();
                // 트랜잭션 자동 커밋 기능 켜기
                conn.setAutoCommit(true);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

            System.out.println("계좌 이체 실패!");
            e.printStackTrace();

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
