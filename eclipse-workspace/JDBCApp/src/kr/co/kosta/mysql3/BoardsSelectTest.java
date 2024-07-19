package kr.co.kosta.mysql3;

import java.sql.*;

public class BoardsSelectTest {

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
            String sql = "SELECT bid, btitle, bcontent, bwriter, bdate, bfilename, bfiledata " +
                    "FROM jdbc.boards " +
                    "WHERE bwriter = ?";

            //PrepareStatement 객체 얻기, 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "kosta1");

            //SQL문 실행, ResultSet을 통해 데이터 읽기
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {            // 데이터 행을 가져오고
                Board board = new Board();
                board.setBid(rs.getInt("bid"));
                board.setBtitle(rs.getString("btitle"));
                board.setBcontent(rs.getString("bcontent"));
                board.setBwriter(rs.getString("bwriter"));
                board.setBdate(rs.getDate("bdate"));
                board.setBfilename(rs.getString("bfilename"));
                board.setBfiledata(rs.getBlob("bfiledata"));
                System.out.println(board);
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
