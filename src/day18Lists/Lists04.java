package day18Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {

	public static void main(String[] args) {
		//Create a method to increase every element of the given list by 3

		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(8);
		list.add(2);
		list.add(9);
		list.add(22);
		increase(list);
	}
	public static void increase(List<Integer> list) {
		for(int i=0; i<list.size(); i++) {
			list.set(i, list.get(i)+3);
		}
		System.out.println(list);
	}
	
}
