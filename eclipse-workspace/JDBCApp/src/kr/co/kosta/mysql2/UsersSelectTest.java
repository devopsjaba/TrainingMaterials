package kr.co.kosta.mysql2;

import java.sql.*;

public class UsersSelectTest {

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

            //매개변수화 된 SQL문 작성
            String sql = "SELECT userid, username, userpassword, userage, useremail " +
                    "FROM jdbc.users " +
                    "WHERE userid = ?";

            //PrepareStatement 객체 얻기, 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "kosta1");

            //SQL문 실행, ResultSet을 통해 데이터 읽기
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {            // 1개의 데이터 행을 가져오는 경우
                User user = new User();
                user.setUserId(rs.getString("userid"));
                user.setUserName(rs.getString("username"));
                user.setUserPassword(rs.getString("userpassword"));
                user.setUserAge(rs.getInt("userage"));
                user.setUserEmail(rs.getString("useremail"));
                System.out.println(user);
            } else {
                System.out.println("사용자가 아이디가 존재하지 않음");
            }

            rs.close();
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
