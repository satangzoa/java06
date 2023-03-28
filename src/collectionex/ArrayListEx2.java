package collectionex;

import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("s001", "홍길동", 8));
		list.add(new Student("s002", "이순신", 20));
		list.add(new Student("s003", "김자바", 35));
		list.add(new Student("s004", "나펭수", 10));
		list.add(new Student("s004", "도라에몽", 10));
		
		printAllStudents(list);
		printStudentInfo(list, "s003");
	}
	
	static void printAllStudents(ArrayList<Student> list) {
		
		for(Student s : list) {
			s.displayInfo();
		}
	}
	
	static void printStudentInfo(ArrayList<Student> list, String studentNo) {
		//학번으로 검색된 학생 객체의 정보를 출력하는 코드를 작성
		
		System.out.println("<< 검색 결과 >>");
		for(Student s : list) {
			if(s.getStudentNo().equals(studentNo)) {
				s.displayInfo(); 
				break;
			}
		
		}
	}
}

class Student {
	private String studentNo;
	private String name;
	private int age;
	
	void displayInfo() {
			
			System.out.println("학번: " + studentNo);
			System.out.println("이름: " + name);
			System.out.println("나이: " + age);
			System.out.println("---------------------------");
		}

	public Student() {
	}

	public Student(String studentNo, String name, int age) {
		this.studentNo = studentNo;
		this.name = name;
		this.age = age;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
