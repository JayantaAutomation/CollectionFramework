package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Author: Jayanta Kumar Panda
 * 
 */

public class ArrayListIteration {

	public static void main(String[] args) {
	
		
		ArrayList<String> studentList = new ArrayList<String>();
		
		studentList.add("Krishna");//0
		studentList.add("RadhaMadhav");//1
		studentList.add("Govinda");//2
		studentList.add("Keshava");//3
		
		//For loop:
		for(int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		
		System.out.println("------------------");
		
		//for each loop:
		for(String s : studentList) {
			System.out.println(s);
		}
		
		System.out.println("----------------------");
		
		//JDK 8 - Streams with Lambda
		studentList.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("----------------------");
		
		//Iterator:
		Iterator<String> it = studentList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
