package day16multidimarrays;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		/*
		 ArrayLists are used to store multiple elements like arrays
		 ArrayLists are flexible in length but Arrays are not
		 ArrayLists accept just non-primitives as data type 
		 */
		//How to create an ArrayList?
		//1st way:
		ArrayList<Integer> list = new ArrayList<>();
		
		//2nd way:
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		//to print ArrayList we directly write the name of the list
		System.out.println(list);//[]
		
		//add() adds elements in insertion order
		list.add(45);
		list.add(78);
		list.add(34);
		
		System.out.println(list);//[45, 78, 34]
		
		//How to add elements in a specific index?
		
		list.add(1, 11);
		System.out.println(list);//[45, 11, 78, 34]
		list.add(3, 234);
		System.out.println(list);//[45, 11, 78, 234, 34]
		
		
	    //How to get an element on the console from a list?
		System.out.println(list.get(0));//45
		
		//How to get the number of elements in a list ? 
		System.out.println(list.size());//5
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
