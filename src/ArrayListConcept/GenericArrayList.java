package ArrayListConcept;

import java.util.ArrayList;

/*
 * Author: Jayanta Kumar Panda
 * 
 */

public class GenericArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		
		marksList.add(100);
		
		ArrayList<Double> arD = new ArrayList<Double>();
		
		arD.add(12.33);
		arD.add(100.0);
		
		ArrayList<String> studentNames = new ArrayList<String>();
	
		studentNames.add("Krishna");
		
		System.out.println(arD.get(1));
	}

}
