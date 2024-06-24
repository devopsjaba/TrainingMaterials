package kr.co.kosta2;

class PriorityThread2 extends Thread {
	
	@Override
	public void run() {
		int sum = 0;
		
		Thread thread = Thread.currentThread();
		System.out.println(thread + " start");
		for(int i=0; i<1000000; i++)
			sum += i;
		
		System.out.println(thread.getPriority() + " end");
	}
}

public class PriorityTest2 {
	public static void main(String[] args) {
		PriorityThread2 pt1 = new PriorityThread2();
		PriorityThread2 pt2 = new PriorityThread2();
		PriorityThread2 pt3 = new PriorityThread2();
		
		pt1.setPriority(Thread.MIN_PRIORITY);
		pt2.setPriority(Thread.NORM_PRIORITY);
		pt3.setPriority(Thread.MAX_PRIORITY);
		
		pt1.start();
		pt2.start();
		pt3.start();
	}
}





