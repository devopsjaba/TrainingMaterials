package kr.co.kosta;


class MyThread extends Thread {
	
	public MyThread() {
		super();
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread() + " start!");
		
		int i;
		for(i=0; i<200; i++)
			System.out.print(i +"\t");
		
		System.out.println(Thread.currentThread() + " end!");
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread() + " start!");
		
		MyThread thread1 = new MyThread();
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.start();
		
		System.out.println(Thread.currentThread() + " end!");
	}
}








