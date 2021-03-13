package k_day17lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List02 {
	public static void main(String[] args) {
		// Working with lists is easier than working with arrays
		// Because of that sometimes we need to convert arrays to lists
		
		String s[]= {"A","C","M","B"};
		
		//To convert an array to a list use asList() method from Arrays Class.
		List<String> ls=Arrays.asList(s); //new yok çünkü baþtan deðil array den 
		
		System.out.println(ls.size());
		
		ls.set(1, "CX");
		System.out.println(ls);//[A, CX, M, B]
		
		
		//If you create a list from an array by using asList() method, you cannot use
		//the methods which affects the size from ArrayList Class
		//ls.remove(1);
		//ls.add("K");
		//ls.clear();
		
		//If you want to be able to use all methods, do not use asList() to convert
		//Use loops to transfer elements to a new list
		
		List<String> nls = new ArrayList<>();
		for (int i = 0; i < s.length; i++) {
			nls.add(s[i]);
		}
		System.out.println(nls);//[A, CX, M, B]
		
		nls.remove(1);
		System.out.println(nls);//[A, M, B]
		
		//How to convert a list to an array
		
		String arrayFromList[] = nls.toArray(new String[0]);
		System.out.println(Arrays.toString(arrayFromList));//[A, M, B]
		
		
		
	}	
		
}
