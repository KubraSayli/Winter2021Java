package k_day17lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List02k {

	public static void main(String[] args) {
	List<Integer> list1 = new ArrayList<>();
	list1.add(5);
	list1.add(3);
	list1.add(7);
	list1.add(2);
	
	//How to sort elements in a list?
	Collections.sort(list1);
	System.out.println(list1);
	
	List<Integer> list2 = new ArrayList<>();
	list2.add(9);
	list2.add(2);
	list2.add(19);
	list2.add(4);
	list2.add(71);
	list2.add(-3);
	
	/*
	 	Type code to find the minimum and maximum value from the list2
	*/
	Collections.sort(list2);
	
	int min = list2.get(0);
	int max = list2.get(list2.size()-1);
	
	System.out.println(min + " : " + max);
	
			//How to remove an element from a list by using index
			//[-3, 2, 4, 9, 19, 71]
			//Below code will remove the element at index 2, and will return the removed element
			System.out.println(list2.remove(2));//4 ==> removed element
			System.out.println(list2);//[-3, 2, 9, 19, 71]
			
			//How to remove an element from a list by using the element value
			//Note:For integer lists, you cannot remove an element by using element value
//		     Because when you put an integer inside the remove() method it will accept it as index.
			
	
	}

}
