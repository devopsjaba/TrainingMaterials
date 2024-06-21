package kr.co.kosta;

import java.io.IOException;

public class SystemInTest2 {
	public static void main(String[] args) {
		System.out.println("알파벳을 여러 개를 쓰고 [Enter] 누르세요.");
		
		int i;
		
		try { // while문에서 read() 메서드로 한 바이트를 반복해 읽음 
			while((i = System.in.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
