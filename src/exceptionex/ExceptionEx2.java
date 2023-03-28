package exceptionex;

public class ExceptionEx2 {
	public static void main(String[] args) {
		method1();
	}
	
	static void method1() {
		try {
			method2();
		} catch(Exception e) {
//			method3에서 발생한 예외사항을 상위의 메서드에서 처리한 예제
			System.out.println("method1()에서 예외사항을 처리했습니다.");
		}
	}

	static void method2() {
			method3();
		}

	static void method3() {
		int a = 10 / 0; //RuntimeException 발생
	}
}
