package kr.co.kosta.mysql5;

import java.util.Scanner;

public class BoardTest {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BoardTest boardTest = new BoardTest();
        boardTest.list();
        //boardTest.mainMenu();
    }

    public void list() {
        System.out.println();
        System.out.println("[게시물 목록]");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "bid", "bwriter", "bdate", "btitle");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "1", "kosta1", "2024.07.19", "장마비가 많이 내림");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "2", "kosta1", "2024.07.18", "경기북부에 호우경보 발령");
        mainMenu();
    }

    public void mainMenu() {
        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println("메인 메뉴 : 1. 생성 | 2. 읽기 | 3. 전체삭제 | 4. 종료");
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
        System.out.println("read() create 실행됨");
    }
}
