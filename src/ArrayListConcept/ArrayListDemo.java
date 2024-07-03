package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		//Array List is a default class
		//It's a dynamic array
		
		/*
		int i[] = new int [4]; //max 4 values - 0,1,2,3
		i[0] = 100;
		i[4] = 200;
		System.out.println(i[0]);
		System.out.println(i[3]);
		*/
		
		//default generics:
		ArrayList<Object> ar = new ArrayList<Object>();
		System.out.println(ar.size());
		ar.add("one");
		ar.add("two");
		System.out.println(ar.size());
		
		ar.ensureCapacity(3);
		System.out.println(ar.size());
		ar.add("three");
		ar.add("four");
		ar.add("five");
		System.out.println(ar.size());
		
		/*
		ar.add(100);//0
		ar.add("testing");//1
		ar.add('t');//2
		ar.add(200);//3
		ar.add(12.33);//4
		ar.add(true);//5
		
		System.out.println(ar);
		System.out.println(ar.get(4));
		
		System.out.println(ar.size());
		System.out.println("LI = " + 0);
		System.out.println("HI = " + (ar.size()-1));
		
		ar.add(400);//6
		ar.add(500);//7
		
		System.out.println(ar.size());
		*/
	}

}
