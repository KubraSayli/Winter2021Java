package day17lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("Ahmed");
		list1.add("Yavuz");
		list1.add("Cemal");
		list1.add("Sibel");
		list1.add(2, "Ali");
		list1.add("Veli");
		list1.add("Yavuz");
		System.out.println(list1);
		
		System.out.println(list1.size());//7
		
		//to get a specific element in list:
		System.out.println(list1.get(2));
		//System.out.println(list1.get(7));//Run Time Error
		
		//to get an index of specific element
		System.out.println(list1.indexOf("Cemal"));//3
		System.out.println(list1.indexOf("X"));//-1
		System.out.println(list1.indexOf("Yavuz"));//the first occurance
		System.out.println(list1.lastIndexOf("Yavuz"));//6
		
		//How to remove an element from a list?
		//There are two remove() methods
		  // 1) remove(index)=> returns element that is removed
		  // 2) remove(elements name)=> returns boolean
		System.out.println(list1.remove(2));//Ali
		System.out.println(list1);
		System.out.println(list1.remove("Sibel"));//true
		System.out.println(list1.remove("x"));//false
		System.out.println(list1);
		//Lists are "mutable" you can update them without assigning them
		//Strings are "immutable" you cannot change them unless you assign them
		String s="Strings are immutable";
		String str = s.replace("are", "");
		System.out.println(s);//Strings are immutable
		System.out.println(str);//Strings  immutable
		
		//to update elements in lists:
		list1.set(2, "John");
		System.out.println(list1);
		//to get a part of a list:
		//in sublist() first index is inclusive, second index is exclusive
		System.out.println(list1.subList(1, 3));//[Yavuz, John]
		
		List<String> list2 = new ArrayList<>();
		list2.add("Ayse");
		list2.add("Serife");
		list2.add("Recep");
		
		list1.addAll(list2);
		System.out.println(list1);//[Ahmed, Yavuz, John, Veli, Yavuz, Ayse, Serife, Recep]
		System.out.println(list2);
		//to add list in a specific index:
		list1.addAll(2, list2);
		System.out.println(list1);
		
		//to remove multiple elements:
		//removeAll() removes all the elements that has same name
		list1.removeAll(list2);
		System.out.println(list1);
		
		//to remove all the elements:
		list1.clear();
		System.out.println(list1);//[]
		
		//to check if list has elements or not:
		System.out.println(list1.isEmpty());//true
			
		
	}

}
