package k_day18_listforeach;

import java.util.ArrayList;
import java.util.List;

public class Lists01k {

	public static void main(String[] args) {
		/*
	 	Create a method to increase every element of the given list by 3
	*/
		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(21);
		list1.add(32);
		list1.add(25);
		list1.add(9);
		increaseElements(list1);

	}
	 public static void increaseElements(List<Integer> list1) {
		 
		 for(int i=0; i<list1.size(); i++) {
			 list1.set(i, list1.get(i)+3);
		 }
		 System.out.println(list1);
		 
	 }
	
	
	
	

}
