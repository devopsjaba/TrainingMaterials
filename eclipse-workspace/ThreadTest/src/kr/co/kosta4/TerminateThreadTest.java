package kr.co.kosta4;

import java.io.IOException;

public class TerminateThreadTest extends Thread {
	private boolean flag = false;
	
	public TerminateThreadTest(String name) {
		super(name);
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	};
	
	@Override
	public void run() {
		while(!flag) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this.getName() + " end");
	}
	
	public static void main(String[] args) throws IOException {
		
		TerminateThreadTest threadA = new TerminateThreadTest("A");
		TerminateThreadTest threadB = new TerminateThreadTest("B");
		TerminateThreadTest threadC = new TerminateThreadTest("C");
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		int in;
		while(true) {
			in = System.in.read();
			
			if(in == 'A') {
				threadA.setFlag(true);
			} else if(in == 'B') {
				threadB.setFlag(true);
			} else if(in == 'C') {
				threadC.setFlag(true);
			} else if(in == 'M') {
				threadA.setFlag(true);
				threadB.setFlag(true);
				threadC.setFlag(true);
				break;
			} else {
				System.out.println("try again");
			}
		}
		
		// 메인 스레드는 사용자 입력을 계속 대기함. 스레드 종료 후에도 다른 스레드는 계속 실행됨
		while(threadA.isAlive() || threadB.isAlive() || threadC.isAlive()) {
			// 스레드가 종료되기를 대기
		}
		System.out.println();
	}
}








