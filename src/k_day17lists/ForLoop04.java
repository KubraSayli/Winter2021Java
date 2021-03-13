package k_day17lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ForLoop04 {

	public static void main(String[] args) {
		/*
		 // Create 2 integer lists and print the common elements on the console
        // If there is no any common element print "No common elements" on the console
        // arr1 = [1, 3, 2, 4]  arr2 = [2, 4, 6, 8, 10] ==> 2 4
		 */

		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(15);
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(7);
		list2.add(14);
		list2.add(11);
		list2.add(14);
		list2.add(15);
		list2.add(17);
		System.out.println(list2);
		
		List<Integer> common = new ArrayList<>();
		
		for(Integer w : list1) {	
			for(Integer t : list2) {
				if(w == t) {
					if(!common.contains(w)) {
						common.add(w);
					}
				}
			}
		}
		System.out.println(common);

	}


}
