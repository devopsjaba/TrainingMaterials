package kr.co.kosta;

/*
 * task1
 * 	: 20미만의 짝수 출력 ( 0, 2, 4, .... 18)
 *    1000밀리세컨드(1초) 쉼
 * 
 * task2
 *  : 10미만의 수 출력 (9부터 ~ 1까지 출력)
 *    500밀리세컨드(0.5초) 쉼	
 */
public class MutiThreadTest {
	public static void main(String[] args) {
		
		Runnable task1 = () -> {
			//20미만 짝수
			for(int i=0; i<20; i=i+2) {
				System.out.print(i + " ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable task2 = () -> {
			//10미만 수 출력 (9~1)
			for(int i=9; i>0; i--) {
				System.out.print(i + " ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		
		thread1.start();
		thread2.start();
	}
}












