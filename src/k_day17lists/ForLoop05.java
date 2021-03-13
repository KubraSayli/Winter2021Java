package k_day17lists;

import java.util.ArrayList;
import java.util.List;

public class ForLoop05 {

	public static void main(String[] args) {
		// Remove repeated elements from a list 
		//Example: [a, b, c, b, a, a, d] ==> [a, b, c, d]
		
		List<String> list =new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("a");
		list.add("a");
		list.add("d");
		System.out.println(list);
		
		List<String> nonRepeatedList = new ArrayList<>();
		
		//1.Way
		for (String w : list) {
			if(nonRepeatedList.contains(w)) {
				continue;
			}
			nonRepeatedList.add(w);
		}
		
		System.out.println(nonRepeatedList);
		
		//2.Way
		for (String w : list) {
			if(!nonRepeatedList.contains(w)) {
						nonRepeatedList.add(w);
			}
		}
		System.out.println(nonRepeatedList);
	}

}
