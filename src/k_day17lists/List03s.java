package k_day17lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List03s {
	
public static void main(String[] args) {
	
	List<String> list1 = new ArrayList<>();
	list1.add("A");
	list1.add("C");
	list1.add("F");
	list1.add("B");
	list1.add("D");
	
	List<String> list2 = new ArrayList<>();
	list2.add("A");
	list2.add("C");
	list2.add("F");
	list2.add("B");
	list2.add("D");
	//How to check a list has a specific element
	//contains() method is used to check the existence of a specified element
	//contains() method returns boolean
	System.out.println(list1.contains("B"));//true
	System.out.println(list1.contains("X"));//false
	
	//How to check if two lists are equal or not
	System.out.println(list1.equals(list2));//true
	
	/*
	 	Ask user to enter a letter
	 	If the letter exists in list1 convert it to "Got it"
	 	otherwise add the element which user entered into the list1
	*/
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a letter");
	
	String str = scan.next().toUpperCase().substring(0,1);
	
	if(list1.contains(str)) {		
		list1.set(list1.indexOf(str), "Got it");
		System.out.println(list1);		
	}else {			
		list1.add(str);
		System.out.println(list1);		
	}
	
	/*
 	How to remove repeated elements from a list
*/
			List<Character> list4 = new ArrayList<>();
			list4.add('x');
			list4.add('y');
			list4.add('x');
			list4.add('y');
			list4.add('x');
			list4.add('z');
			list4.add('m');
			
	List<Character> list5 = new ArrayList<>();
	for(int i=0; i<list4.size(); i++) {	
//		if(!list5.contains(list4.get(i))) {	
//			list5.add(list4.get(i));	
//		}	
		
		 if(list5.contains(list4.get(i))) { continue; }
		 list5.add(list4.get(i));	
	}

	System.out.println(list5);
	//containAll()
	List<Character> list3 = new ArrayList<>();
	//!!! list3.add("j");
	list3.add('x');
	list3.add('m');
	list3.add('z');
	System.out.println(list3);//[X, Ali, Jack]
	//önce false.. biri contain olmasý yetmez
	//If you want to check if multiple elements exist in a list
	System.out.println(list4.containsAll(list3)); //true
	scan.close();
}


}
