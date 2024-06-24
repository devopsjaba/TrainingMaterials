package kr.co.kosta5.solve3;

class Bank {
	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	//예금하다
	public void deposite(int save) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m + save);
	}
	
	//인출하다
	public void withdraw(int minus) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m - minus);
	}
}

class Lee extends Thread {
	@Override
	public void run() {
		synchronized (SynchronizationTest.myBank) {
			System.out.println("입금 시작");
			SynchronizationTest.myBank.deposite(3000);
			System.out.println("3000원 입금 : " + SynchronizationTest.myBank.getMoney());			
		}
	}
}

class Shin extends Thread {
	@Override
	public void run() {
		synchronized (SynchronizationTest.myBank) {
			System.out.println("출금 시작");
			SynchronizationTest.myBank.withdraw(1000);
			System.out.println("1000원 출금 : " + SynchronizationTest.myBank.getMoney());			
		}
	}
}

public class SynchronizationTest {
	public static Bank myBank = new Bank();
	public static void main(String[] args) {
		Lee threadLee = new Lee();
		threadLee.start();
		
		Shin threadShin = new Shin();
		threadShin.start();
		
	}
}









