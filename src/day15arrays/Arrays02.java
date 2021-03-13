package day15arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// ===Equality of Arrays====
		/*
		 int a []={9,4,6,3};
		 int b []={9,4,6,3};
		 int c []={9,4,3,6};
		 Check if array a is equal to array b
		 Check if array a is equal to array c
		 */
		/*
		 If the arrays are equal to each other, same elements must be in same indexes
		 */
	     int a []={9,4,6,3,14};
		 int b []={9,4,6,3};
		 int c []={9,4,3,6};
		 
		 
		 //1st way check the equality by using loop
		 int length = 0;
		 if(a.length<b.length) {
			 length=a.length;
		 }else {
			 length=b.length;
		 }
		 
		 int counter=0;
		 for(int i = 0; i<length; i++) {
			
			 if( a[i] != b[i]) {
			   counter++;
			}
		 }
		 if(a.length!=b.length || counter!=0) {
			 System.out.println("Arrays are not equal");
		 }else {
			 System.out.println("Arrays are equal");
		 }
		 
		 //2.st Use method from Arrays class
		 int a1[]= {2,9,3,7};
		 int a2[]= {2,9,7,3};
		 
		 System.out.println(Arrays.equals(a1, a2));//false
		 
		 //How to check it two arrays have same elements or not?
		 Arrays.sort(a1);
		 System.out.println(Arrays.toString(a1));//[2, 3, 7, 9]
		 Arrays.sort(a2);
		 System.out.println(Arrays.toString(a2));//[2, 3, 7, 9]
		 System.out.println(Arrays.equals(a1, a2));
		 
		
	}

}
