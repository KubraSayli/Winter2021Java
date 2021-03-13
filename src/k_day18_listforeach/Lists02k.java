package k_day18_listforeach;

import java.util.ArrayList;
import java.util.List;

public class Lists02k {
	/* 
 	Create a method to delete odd elements and increase the even elements by multiplying 5
*/
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(1);
		list1.add(4);
		list1.add(3);
		list1.add(10);
		list1.add(5);
		updateList(list1);
	}

	public static void updateList(List<Integer> list1) {
		for(int i=0; i<list1.size(); i++) {
			if(list1.get(i)%2!=0) {
				list1.remove(i);
				i--;
			}else {
				list1.set(i, list1.get(i)*5);
			}
			
		}
		System.out.println(list1);
	}
	
	
}
