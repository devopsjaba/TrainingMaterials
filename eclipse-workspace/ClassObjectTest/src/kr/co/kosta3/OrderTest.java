package kr.co.kosta3;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		order.orderId = 202405281108001L;
		order.customerId = "kosta100";
		order.orderDate = "2024년 5월 28일";
		order.customerName = "홍길동";
		order.productId = "PD123-12";
		order.shippingAddress = "경기도 성남시 오리역 인근";
		
		System.out.println("주문 번호 : " + order.orderId);
		System.out.println("주문자 아이디 : " + order.customerId);
		System.out.println("주문 날짜 : " + order.orderDate);
		System.out.println("주문 이름 : " + order.customerName);
		System.out.println("주문 상품 번호 : " + order.productId);
		System.out.println("배송 주소 : " + order.shippingAddress);
	}
}
