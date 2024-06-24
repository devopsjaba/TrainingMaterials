package kr.co.kosta3;

/*
 * 	1부터 50, 51부터 100까지의 합을 구하는 2개의 Thread를 생성하시오.
 */
public class JoinTest extends Thread {

	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end) {
		//super();
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		int i;
		for(i = start; i<=end; i++)
			total += i;
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread() + " start");
		
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();
		
		int sum = jt1.total + jt2.total;
		
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		
		System.out.println("전체 sum = " + sum);
		
		System.out.println(Thread.currentThread() + " end");
	}
}







