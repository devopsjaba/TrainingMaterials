package kr.co.kosta; // 패키지 선언부 

import java.io.File;

/*
	여러 줄 주석
	
 */
public class Hello { // 클래스 선언부 // Hello.class

	// 리턴타입 메서드명
	public static void main(String[] args) { // main() 메서드

		// 1줄 주석
		System.out.println("Hello Kosta!"); // 화면출력
		System.out.println("꿀모닝");
		System.out.println();
		System.out.println(5);
		System.out.println(3.8);
		System.out.println(3 + 5);
		System.out.println("화면" + 3);
		System.out.println(3 + 5 + "화면");
		System.out.println("화면" + 3 + 5);
		System.out.println();

		int kosta = 3;
		String kostaStr = "화면";
		System.out.println(kosta); // 3
		System.out.println(kostaStr); // 화면
		System.out.println(kostaStr + "출력");
		System.out.println(kosta + kostaStr);
		System.out.println();

		System.out.print("화면");
		System.out.print("출력\n"); // \n을 출력하면 개행, 즉 줄바꿈을 실행함
		System.out.print(3);
		System.out.println();

		System.out.printf("%d\n", 30); // 30(10진수)
		System.out.printf("%o\n", 30); // 36(8진수)
		System.out.printf("%x\n", 30); // 1e(16진수)
		System.out.printf("%s\n", "출력"); // 출력
		System.out.printf("%f\n", 5.8); // 5.800000
		System.out.printf("%4.2f\n", 5.8); // 5.80
		System.out.printf("%d와 %4.2f\n", 4, 5.8); // 4와 5.80
		System.out.printf("%1.2f\n", 5.8);

		File file;
	}
}
