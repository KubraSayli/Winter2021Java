package k_day17lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List02s {
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
		
		scan.close();

	}
}
