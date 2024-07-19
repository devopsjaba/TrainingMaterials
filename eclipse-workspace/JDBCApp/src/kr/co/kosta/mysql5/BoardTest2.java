package kr.co.kosta.mysql5;

import java.sql.*;
import java.util.Scanner;

public class BoardTest2 {
    private Scanner scanner = new Scanner(System.in);
    private Connection conn;

    // 생성자
    public BoardTest2() {
        //JDBC Driver 등록
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //연결하기
            conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/jdbc",
                    "kosta",
                    "pass123#"
            );
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        BoardTest2 boardTest = new BoardTest2();
        boardTest.list();
        //boardTest.mainMenu();
    }

    public void list() {
        System.out.println();
        System.out.println("[게시물 목록]");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "번호", "작성자", "작성일자", "제목");          // 컬럼명 출력
        System.out.println("------------------------------------------------------------------");

        // boards 테이블에서 게시물 정보를 읽어와서 출력
        String sql = "SELECT bid, btitle, bcontent, bwriter, bdate " +
                "FROM jdbc.boards " +
                "order by bid desc";

        //PrepareStatement 객체 얻기
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);

            //SQL문 실행, ResultSet을 통해 데이터 읽기
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {            // 데이터 행을 가져오고
                Board board = new Board();
                board.setBid(rs.getInt("bid"));
                board.setBtitle(rs.getString("btitle"));
                board.setBcontent(rs.getString("bcontent"));
                board.setBwriter(rs.getString("bwriter"));
                board.setBdate(rs.getDate("bdate"));
                System.out.printf("%-6s%-12s%-16s%-40s\n",
                                    board.getBid(),
                                    board.getBwriter(),
                                    board.getBdate(),
                                    board.getBtitle());
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        mainMenu();
    }

    public void mainMenu() {
        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println("메인 메뉴 : 1. 작성 | 2. 읽기 | 3. 전체삭제 | 4. 종료");
        System.out.print("메뉴 선택: ");
        String menuNo = scanner.nextLine();
        System.out.println();

        switch (menuNo) {
            case "1" -> create();
            case "2" -> read();
            case "3" -> clear();
            case "4" -> exit();
        }
    }

    public void exit() {
        System.out.println("프로그램이 종료됨");
        System.exit(0);
    }

    public void clear() {
        System.out.println("clear() 메소드 실행됨");
    }

    public void read() {
        System.out.println("read() 메소드 실행됨");
    }

    public void create() {
        //입력 받기 - 제목, 내용, 글쓴이 , (날짜)
        Board board = new Board();
        System.out.println("[새 게시물 작성]");
        System.out.print("제목 : ");
        board.setBtitle(scanner.nextLine());
        System.out.print("내용 : ");
        board.setBcontent(scanner.nextLine());
        System.out.print("글쓴이 : ");
        board.setBwriter(scanner.nextLine());

        //서브메뉴 출력
        //"서브메뉴: 1.확인 | 2.취소"
        //"메뉴선택: "
        System.out.println("------------------------------------------------------");
        System.out.println("서브메뉴: 1.확인 | 2.취소");
        System.out.print("메뉴선택: ");
        String menuNo = scanner.nextLine();
        if(menuNo.equals("1")) {
            //SQL문 작성 (board)
            String sql = "INSERT INTO jdbc.boards (btitle, bcontent, bwriter, bdate) " +
                    "VALUES(?, ?, ?, now())";

            try {
                //PreparedStatement 객체 얻기(생성)
                PreparedStatement pstmt = conn.prepareStatement(sql);
                //값 지정
                pstmt.setString(1, board.getBtitle());
                pstmt.setString(2, board.getBcontent());
                pstmt.setString(3, board.getBwriter());

                //SQL문 실행
                int rows = pstmt.executeUpdate();
                //PreparedStatement 닫기
                pstmt.close();

            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }

        //업데이트된 게시물 목록 출력
        list();

    }
}
