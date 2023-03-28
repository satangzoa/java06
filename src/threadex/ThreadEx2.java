package threadex;


public class ThreadEx2 {
	public static void main(String[] args) throws InterruptedException {
		은행계좌 a1 = new 은행계좌();
		
		사람 p1 = new 사람(a1);
		사람 p2 = new 사람(a1);
		사람 p3 = new 사람(a1);
		사람 p4 = new 사람(a1);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
		long from = System.currentTimeMillis();
		
		p1.join(); // 첫번째 쓰레드가 종료될 때까지 대기
		p2.join(); // 두번째 쓰레드가 종료될 때까지 대기
		p3.join(); // 세번째 쓰레드가 종료될 때까지 대기
		p4.join(); // 네번째 쓰레드가 종료될 때까지 대기

		long to = System.currentTimeMillis();
		
		System.out.println("잔액: " + a1.잔액);
		System.out.println("수행시간: " + (to - from) + "ms");//0.001초 단위
	}
}

class 사람 extends Thread{
	은행계좌 a;
	사람(은행계좌 a) {
		this.a = a;
	}
	
	public void 은행업무() {
		for(int i = 1; i <= 1000; i++) {
			a.입금(i);
			a.출금(i);
		}
	}
	
//	새로운 스레드에 의해 수행되는 메서드
	public void run() {
		은행업무();
	}
}


class 은행계좌 {
	public long 잔액;

//	synchronized 키워드를 이용해서 동시성 문제를 해결
	public synchronized void 입금(long 금액) {
		잔액 = 잔액 + 금액 ;
	}

	public void 출금(long 금액) {
		synchronized(this) {
			잔액 -= 금액;
		}
	}
}
