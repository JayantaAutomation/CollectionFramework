package ArrayListConcept;

import java.util.ArrayList;

/*
 * Author: Jayanta Kumar Panda
 * 
 */

public class VirtualCapacity {

	public static void main(String[] args) {
	
		ArrayList<Object> ar = new ArrayList<Object>(20);
		
		System.out.println(ar.size());//PC = 0
		
		ar.add(100);//0
		
		System.out.println(ar.size());
		
		ar.add(200);
		ar.add(300);
		ar.add(400);
		
		
		System.out.println(ar.size());
		
		

	}

}
