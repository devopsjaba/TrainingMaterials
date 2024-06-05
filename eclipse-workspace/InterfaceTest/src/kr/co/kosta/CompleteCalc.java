package kr.co.kosta;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1 / num2;
		else
			return Calc.ERROR;	// num2가 0, 즉 나누는 수가 0인 경우에 대해 오류 반환 
	}

	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
}
