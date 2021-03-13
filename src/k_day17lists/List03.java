package k_day17lists;

import java.util.ArrayList;
import java.util.List;

public class List03 {
	public static void main(String[] args) {
		/*
		 * Create an integer array with 5 elements
		 * Convert to a list
		 * Add 11, and 13 into the list, 11 will be at the beginning, 13 will be at index 3
		 * Increase the value of every element by 3
		 * Print the multiplication of the elements from index 2 to index 5
		 */
		
		int a[]= {4,3,5,6,8};
		List<Integer> ls = new ArrayList<>();
		System.out.println(ls);
		
		
		for (int i = 0; i < a.length; i++) {
			ls.add(a[i]);
		}
		System.out.println(ls);
		
		ls.add(0, 11);
		ls.add(3, 13);
		System.out.println(ls);
		
		for (int j = 0; j < ls.size(); j++) {
			ls.set(j, ls.get(j)+3);
		}System.out.println(ls);
		
		int product = 1;
		for (int i = 2; i <=5; i++) {
			product *= ls.get(i);
		}
		System.out.println(product);

	}

}
