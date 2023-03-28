package collectionex;

import java.util.HashMap;

public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<>();
		
		map.put("s001", new Student("s001", "홍길동", 8));
		map.put("s002", new Student("s002", "이순신", 20));
		map.put("s003", new Student("s003", "김자바", 35));
		map.put("s004", new Student("s004", "나펭수", 10));
		map.put("s004", new Student("s004", "도라에몽", 10));
	
		String key = "s002";
		
		// key 값에 해당하는 객체가 컬렉션에 존재하는지 사전에 검사
		if(map.containsKey(key))
			map.get(key).displayInfo();
		else
			System.out.println(key + "에 학번으로하는 학생이 존재하지 않습니다.");
		
		System.out.println("<< 학생 목록 >>");
		
		for(Student s: map.values()) {
			s.displayInfo();
		}
		
		//kep에 해당하는 학생 객체를 컬렉션에서 제거한다.
		map.remove(key);
		
		
		System.out.println("<< 학생 key 목록(학번 목록) >>");
		
		for(String k :map.keySet()) {
			System.out.println("key: " + k);
			map.get(k).displayInfo();
		}
	}
}







