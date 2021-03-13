package k_day15_arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {

	/*
	
		int a[] = {9,4,6,3};
		int b[] = {9,4,6,3};
		int c[] = {4,6,3,9};
	 1) Check if array a equals array b 
	 2) Check if array b equals array C 
	 */
	public static void main(String[] args) {
	/*
	 If two arrays are equal to each other , same elements 
	 must be in same indexes
	 */
		
		int a[] = {9,4,6,3,98};
		int b[] = {9,4,6,3};
		int c[] = {4,9,6,3};

		//1.st way
		int counter = 0;
		
		//!!!!!burayý sonra 
		int length = 0;
		
		if(a.length<b.length){
			length = a.length;
		}else {
			length= b.length;
		}//!!!!!!
		
		for(int i = 0; i<length ; i++) {
			
			if(a[i] != c[i]) {
				counter++;
			}
          	
		}
		if(a.length!=b.length || counter != 0) {
			System.out.println("Arrays are not equal");
		}else {
			System.out.println("Arrays are equal");
		}
		
		//2nd way:Use method for Arrays class
		int a1[]= {2,9,3,7};
		int a2[]= {2,3,9,7};
		System.out.println(Arrays.equals(a1, a2));//false
		//true göster, length i deðiþtir 
		//behind the equals() ...
		
		//How to check if 2 arrays have same elements?
		
				Arrays.sort(a1); 
				Arrays.sort(a2); 
				System.out.println(Arrays.equals(a1, a2)); //true
		
	}

}
