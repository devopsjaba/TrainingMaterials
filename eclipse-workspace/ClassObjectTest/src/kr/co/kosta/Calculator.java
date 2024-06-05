package kr.co.kosta;

public class Calculator {

		  //반환형   // 매개변수 
	public int add(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	public int getTenTotal() {
		int i;
		int total = 0;
		for(i = 1; i <= 10; i++) {
			total += i;
		}
		return total;
	}
	
	// void : 반환할 값이 없다 
	public void printGreeting(String name) {
		System.out.println(name + "님 안녕하세요.");
		return;		// 반환값 없음, 함수 수행을 끝내고 프로그램 흐름 중에서 호출한 곳으로 다시 되돌아갈 때 사용함  
	}
	
	// divide, 두 수를 매개변수로 나눗셈을 한 후 몫을 출력하는 함수. 반환값은 없음 
	// 단, 만약 나누는 수가 0이라면 수행이 안됨 
	void divide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
			return;		// 함수 수행 종료
		}
		else {
			int result = num1 / num2;
			System.out.println(num1 +"/"+ num2 +"="+ result + "입니다.");
		}
	}
	
	
}








