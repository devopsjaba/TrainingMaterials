package kr.co.kosta3;

public class CustomerTest {
	public static void main(String[] args) {
//		Customer customerHong = new Customer();
//		customerHong.setCustomerId(10001);
//		customerHong.setCustomerName("홍길동");
//		customerHong.bonusPoint = 1000;
//		System.out.println(customerHong.showInfo());
//		System.out.println();
//		
//		VIPCustomer customerShin = new VIPCustomer();
//		customerShin.setCustomerId(10002);
//		customerShin.setCustomerName("신사임당");
//		customerShin.bonusPoint = 10000;
//		System.out.println(customerShin.showInfo());
		
		Customer customerHong = new Customer(10001,"홍길동");
		customerHong.bonusPoint = 1000;
		System.out.println(customerHong.showInfo());
		System.out.println();
		
		VIPCustomer customerShin = new VIPCustomer(10002, "신사임당", 100);
		customerShin.bonusPoint = 10000;
		System.out.println(customerShin.showInfo());	
		
		// vc 변수는 Customer 클래스의 멤버 변수와 메서드만 사용 가능 
		// 묵시적 형변환(UpCasting)
		Customer vc = new VIPCustomer(10003, "이순신", 200);
		
	}
}






