package kr.co.kosta2;

public interface Scheduler {
	public void getNextCall();		// 다음 전화를 가져오는 기능 
	public void sendCallToAgent();	// 상담원에게 전화를 배분하는 기능
}
