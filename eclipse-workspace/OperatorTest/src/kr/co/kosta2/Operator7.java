package kr.co.kosta2;

// 비트 연산자 
public class Operator7 {
	public static void main(String[] args) {
		System.out.println(3 & 10);						//2 
		System.out.println(0b00000011 & 0b00001010);	// 2
		System.out.println(0x03 & 0x0A);				// 2
		
		System.out.println(3 | 10);						//11 
		System.out.println(0b00000011 | 0b00001010);	// 11
		System.out.println(0x03 | 0x0A);				// 11	
		
		System.out.println(3 ^ 10);						//9
		System.out.println(0b00000011 ^ 0b00001010);	// 9
		System.out.println(0x03 ^ 0x0A);				// 9			
	}
}
