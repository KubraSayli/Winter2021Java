package k_day18_listforeach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List03 {
public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(21);
		list1.add(32);
		list1.add(25);
		list1.add(90);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(111);
		list2.add(222);
		list2.add(333);
		list2.add(444);
		list2.add(555);
		
		//How to join two lists
		//list1 changes below
		//addAll() method adds the elements at the end
		//Returns true if this list changed as a result of the call
		System.out.println(list1.addAll(list2));//true
		
		System.out.println(list2);//[111, 222, 333, 444, 555]
		System.out.println(list1);//[12, 21, 32, 25, 90, 111, 222, 333, 444, 555]
		
		list1.addAll(2, list2);
		System.out.println(list1);//[12, 21, 111, 222, 333, 444, 555, 32, 25, 90, 111, 222, 333, 444, 555]
		
		
		//How to delete all elements from a list
		//clear() method removes all of the elements from this list
		//clear() method returns nothing ==> return type is "void"
//		list2.clear();
//		System.out.println(list2);//[]
		
		//How to check existence of multiple elements
		//list1.containsAll(list2) method returns true if all elements of list2 exist in the list1
		System.out.println(list1.containsAll(list2));
		
		//How to get the index of last occurence of an element in a list
		//[12, 21, 111, 222, 333, 444, 555, 32, 25, 90, 111, 222, 333, 444, 555]
		System.out.println(list1.lastIndexOf(111));//10
		
		//How to remove multiple elements from a list
		//[12, 21, 111, 222, 333, 444, 555, 32, 25, 90, 111, 222, 333, 444, 555]
		//[111, 222, 333, 444, 555]
		list1.removeAll(list2);
		System.out.println(list1);//[12, 21, 32, 25, 90]
		
		
		//How to delete elements by using some conditions
		//It returns true if any element is removed otherwise it returns false
		list1.removeIf(t -> t%2!=0);
		System.out.println(list1);//[12, 32, 90]
		
		//How to get a specific part of a list
		//subList(1, 3) ==> 1 is inclusive, 3 is exclusive
		//subList(1, 3) ==> It returns the sublist
		System.out.println(list2.subList(1, 3));//[222, 333]
		
		
		//How to convert a list to an array
		System.out.println(list2.toArray());//[Ljava.lang.Object;@e6ea0c6
		System.out.println(Arrays.toString(list2.toArray()));//[111, 222, 333, 444, 555]
		
		//How to convert an array to a list <== We use that many times
		//When you create a list by using array, some array features transferred to the list
		//As you know, arrays are not flexible in length, the list which is created from an array will not be 
		//flexible in size.
		
		//Note: The methods are not related with length can be used in lists which are created from arrays.
		Integer arr[] = {1, 54, 21, 13};
		List<Integer> list3 = Arrays.asList(arr);
		
		//list3.remove(2);//UnsupportedOperationException
		//list3.clear();//UnsupportedOperationException
		//list3.add(34, arr);//UnsupportedOperationException
		list3.set(1, 63);
		System.out.println(list3);//[1, 63, 21, 13]
		System.out.println(list3.subList(2, 4));//[21, 13]
	}

}
