package exceptionex;

public class ExceptionEx1 {
	public static void main(String[] args) {
		calculate("1000", "10");
	}
	
	static void calculate(String v1, String v2) {
		try {
			int[] arr = new int[10];
//			arr[10] = 100; // 존재하지 않는 배열 방을 접근
			
			int n1 = Integer.parseInt(v1); //문자열을 int 타입으로(정수로) 바꿔준다
			int n2 = Integer.parseInt(v2);
			
			int result = n1 / n2;
			
			System.out.println(n1 + " / " + n2 + " = " + result);
		} catch(NumberFormatException e) {
			System.out.println("[오류] 입력된 숫자가 잘못되었습니다. ");
		} catch(ArithmeticException e) {
			System.out.println("[오류] 0으로 나눌 수 없습니다.");
		} catch(Exception e) {
			System.out.println("[오류] 다음과 같은 오류가 발생하였습니다.\n" + e.getMessage());
		} finally {
//			예외사항 발생 여부와 관계 없이 항상 수행되는 코드
			System.out.println("연산을 종료합니다.");
		}
		 
	}
}
