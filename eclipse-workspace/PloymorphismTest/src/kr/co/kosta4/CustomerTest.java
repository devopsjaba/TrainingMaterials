package kr.co.kosta4;

import java.util.ArrayList;

/*
 * 	ArrayList 배열로 고객 5명을 생성하고 출력하시오.
 * 	 - Customer 2명, GoldCustomer 2명, VIPCustomer 1명 
 * 	 - 예시) 홍길동님의 10000원을 지불했습니다.
 *          홍길동님의 현재 보너스 포인트는 6000점입니다. 
 */
public class CustomerTest {
	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerhong = new Customer(10010, "홍길동");
		Customer customershin = new Customer(10020, "신사임당");
		Customer customerLee = new GoldCustomer(10030, "이순신");
		Customer customerLe = new GoldCustomer(10040, "이방원");
		Customer customerJung = new VIPCustomer(10050, "정철", 12345);
		
		customerList.add(customerhong);
		customerList.add(customershin);
		customerList.add(customerLee);
		customerList.add(customerLe);
		customerList.add(customerJung);
		
		System.out.println("================");
		for(Customer customer : customerList) {
			System.out.println(customer.showInfo());
		}
		
		System.out.println("================");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calPrice(price);
			System.out.println(customer.getCustomerName() +"님이 "+ cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() +"님의 현재 보너스 포인트는 " 
								+ customer.bonusPoint + "점 입니다.");
		}
		
	}
}





















