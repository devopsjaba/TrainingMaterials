package kr.co.kosta;

import java.util.Scanner;

public class KostaBankAccount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 사용자 입력으로 계좌 개설
		System.out.println("계좌 소유자 이름을 입력하세요: ");
		String owner = scanner.nextLine();
		System.out.println("초기 입금액을 입력하세요: ");
		double balance = scanner.nextDouble();
		
		boolean exit = false;
		while(!exit) {
			// 메뉴 출력
			System.out.println("메뉴를 선택하시오: 1.입금 2.출금 3.잔액 4.종료");
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				// 입금 처리
				
			} else if(choice == 2) {
				// 출금 처리
				
			} else if(choice == 3) {
				// 잔액 확인
				
			} else if(choice == 4) {
				// 종료
				exit = true;
				System.out.println("프로그램을 종료합니다.");
			} else {
				System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
			}
		}
		
		
		scanner.close();
	}
}









