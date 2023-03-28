package threadex;

public class ThreadEx1 {
	public static void main(String[] args) {
		MyClass mc1 = new MyClass("A");
		MyClass mc2 = new MyClass("B");
		MyClass mc3 = new MyClass("C");
		MyClass mc4 = new MyClass("D");
		
		mc1.start();
		mc2.start();
		mc3.start();
		mc4.start();
		
		
//		mc1.run();
//		mc2.run();
//		mc3.run();
//		mc4.run();
	}
}

class MyClass extends Thread {
	private String name;
	
	public MyClass(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.print(name);
			
			try {
				Thread.sleep(100); // 0.1초간 지연
			} catch (InterruptedException e) {
			} 
		}
	}
}
