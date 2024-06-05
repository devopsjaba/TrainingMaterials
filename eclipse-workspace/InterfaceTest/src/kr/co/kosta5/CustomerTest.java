package kr.co.kosta5;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		//Customer 클래스형  customer를 Buyer 인터페이스형인 buyer에 대입
		Buyer buyer = customer;
		buyer.buy();
		buyer.order();
		
		//Customer 클래스형  customer를 Seller 인터페이스형인 seller에 대입
		Seller seller = customer;
		seller.sell();
		seller.order();
		
		if(seller instanceof Customer) { 
			Customer customer2 = (Customer)seller; // seller를 하위 클래스형인 Customer로 다시 형변환
			customer2.buy();
			customer2.sell();
		}
		
	}
}
