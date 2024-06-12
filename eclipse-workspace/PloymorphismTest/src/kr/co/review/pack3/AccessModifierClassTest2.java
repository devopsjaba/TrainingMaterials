package kr.co.review.pack3;

import kr.co.review.pack4.AA;
import kr.co.review.pack4.CC;

public class AccessModifierClassTest2 {
	public static void main(String[] args) {
		// 객체 생성
		AA a = new AA();
		//BB b = new BB(); -- 클래스 BB는 임포트를 할 수 없으므로 객체 선언과 생성자 호출 모둘 불가능
		//CC c = new CC(); -- 클래스 CC는 객체는 선언할 수 있지만(CC c), default 생성자이므로 생성자 호출 불가능 
		
	}
}
