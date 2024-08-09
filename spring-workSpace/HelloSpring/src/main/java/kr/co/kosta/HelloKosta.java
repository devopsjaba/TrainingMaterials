package kr.co.kosta;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller		//1.원격 호출가능한 프로그램으로 등록
public class HelloKosta {
	int iv = 100;			// 인스턴스 변수
	static int cv = 200;		//클래스(static, 공유) 변수
	
	@RequestMapping("/okay")		// 2.URL과 메서드를 연결
	private void kosta() {				// 인스턴스 메서드 - 인스턴스 변수, static 변수 둘다 사용 가능 
		System.out.println("Okay! Hi Kosta!");
		System.out.println("iv = " + iv);
		System.out.println("cv = " + cv);
	}
}
