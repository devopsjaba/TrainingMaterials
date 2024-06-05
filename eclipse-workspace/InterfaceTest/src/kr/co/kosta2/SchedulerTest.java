package kr.co.kosta2;
/*
 * 전화 상담 할당 방식을 선택하세요.
 * R : 한명씩 차례로 할당
 * L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당
 * P : 우선순위가 높은 고객 먼저 할당
 * 
 * L (입력받기)
 * 상담 전화를 순서대로 대기열에서 가져옵니다.
 * 현재 상담 업무가 없거나 상담 대기가 가장 적은 상담원에게 할당합니다.
 * 
 * 
 * 상담원 배분 정책 추가 
 * 	getNextCall() : '상담원이 다음 전화 요청'
 *  sendCallToAgent() : '상담원이 전화 상담을 가져갔습니다'
 */
import java.io.IOException;

public class SchedulerTest {
	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당 ");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");
		System.out.println("A : 상담원이 상담 가져가기");
		
		int kosta = System.in.read();		// 상담원 할당 방식을 입력받아 kosta변수에 대입 
		Scheduler scheduler = null;
		
		if(kosta == 'R' || kosta == 'r')
			scheduler = new RoundRobin();			// 입력받은 값이 R 또는 r이면 RoundRobin 객체 생성
		else if(kosta == 'L' || kosta =='l')
			scheduler = new LeastJob();				// 입력받은 값이 L 또는 l이면 LeastJob 객체 생성
		else if(kosta == 'P' || kosta == 'p')
			scheduler = new PriorityAllocation();	// 입력받은 값이 P 또는 p이면 PriorityAllocation 객체 생성
		else if(kosta == 'A' || kosta == 'a')
			scheduler = new AgentGetCall();
		else {
			System.out.println("지원되지 않는 기능이다.");
			return;
		}
			
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
	
}










