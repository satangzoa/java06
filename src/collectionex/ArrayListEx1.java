package collectionex;

import java.util.*;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("사과");
		list.add("배");
		list.add("귤");
		list.add("바나나");
		
		System.out.println("2번째 과일: " + list.get(1));
		

		for(Object s :list) {
			int len = ((String)s).length();
			System.out.println(s.toString() + "(" + len + ")");
		}

	System.out.println("------------------------------------");
	
	ArrayList<String> list2 = new ArrayList<String>();
	list2.add("사과");
	list2.add("배");
	list2.add("귤");
	list2.add("바나나");
	
	for(String s: list2) {
		System.out.println(s + "(" + s.length() + ")");
	}
	}
	
}









