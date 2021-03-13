package k_day17lists;

import java.util.ArrayList;
import java.util.List;

public class MyClass {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Mary");
		list1.add(2,"John");
		list1.add("Brad");
		
		
	    System.out.println(list1);
	    System.out.println(list1.get(1));
	    
	    //How to get an index of specific element?
	    System.out.println(list1.indexOf("Ali"));
	    
	    
	    List<String> list2 = new ArrayList<>();
	    
	    list2.add("A");
		list2.add("V");
		list2.add("M");
		list2.add(2,"Jo");
		list2.add("Br");
	    
	System.out.println(	list1.addAll(list2));
	    
	 System.out.println(list1);   
	 list2.addAll(2, list1);
	    
	    System.out.println(list2);
	    System.out.println(list1);
	    list1.removeAll(list2);
	    System.out.println(list1);
	    
	    System.out.println(list2);
	    list2.clear();
	    System.out.println(list2);
	    System.out.println(list2.isEmpty());
	    
	    
	    
	    
	}

}
