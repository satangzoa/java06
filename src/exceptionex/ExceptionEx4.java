package exceptionex;

public class ExceptionEx4 {
	public static void main(String[] args) {
		은행계좌 a1 = new 은행계좌();
		try {
			a1.입금(1000);
			a1.출금(700);
			a1.출금(500);

		} catch (잔액부족예외사항 e) {
			System.out.println("출금하는 중 오류가 발생하였습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("잔액: " + a1.잔액);
	}
}

class 은행계좌 {
	public long 잔액;

	public void 입금(long 금액) {
		잔액 += 금액;
	}

	public void 출금(long 금액) throws 잔액부족예외사항 {
		if (잔액 >= 금액)
			잔액 -= 금액;
		else
			throw new 잔액부족예외사항("현재 잔액이 부족합니다.( 잔액: " + 잔액 + ")");
	}
}

class 잔액부족예외사항 extends Exception {
	잔액부족예외사항(String msg) {
		super(msg); // 부모의 생성자 기능을 활용
	}
}
