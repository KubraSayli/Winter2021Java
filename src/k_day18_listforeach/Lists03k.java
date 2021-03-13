package k_day18_listforeach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists03k {

	public static void main(String[] args) {
		// Working with lists is easier than working with arrays
		// Because of that sometimes we need to convert arrays to lists
		
	   Integer arr[] = {4,7,9,1,8};
	 //To convert an array to a list use asList() method from Arrays Class.
	   List<Integer> list1=Arrays.asList(arr);
	   System.out.println(list1);
	   
	   //Use some methods that are created for lists:
	   list1.set(3, 6);
	   System.out.println(list1);
	   System.out.println(list1.subList(2, 4));
	   
	   //list1.remove(2);// java.lang.UnsupportedOperationException
	   //list1.clear();// java.lang.UnsupportedOperationException
	    // list1.add(6);// java.lang.UnsupportedOperationException
	   
	   //Note: If you convert an array to a list by using asList() you cannot
	   //use methods that are related with length.
	   //Instead, create a list and the the elements of the array and put them 
	   //in that list one by one 
	   int brr[]= {5,4,3,6,7,9};
	    List<Integer> newList = new ArrayList<>();
	    for(int i=0; i<brr.length; i++) {
	    	newList.add(brr[i]);
	    }
	   System.out.println(newList);
	   
	   newList.remove(2);
	   System.out.println(newList);
	   
	   newList.removeIf(t->t%2==0);
	   System.out.println(newList);
	   
	   //How to convert a list to an array?
	   System.out.println(Arrays.toString(newList.toArray()));//put . and see array methods
	   
	   Object[] arrayFromList = newList.toArray();
		System.out.println(Arrays.toString(arrayFromList));
	   
	   
	}

}
