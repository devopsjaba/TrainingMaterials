package kr.co.kosta6;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEmployeeName("홍길동");
		System.out.println(employee1.serialNum);
		
		Employee employee2 = new Employee();
		employee2.setEmployeeName("신사임당");
		System.out.println(employee2.serialNum);
		employee2.serialNum++;
		
		System.out.println(employee1.serialNum);
		System.out.println(employee2.serialNum);
	}
}
