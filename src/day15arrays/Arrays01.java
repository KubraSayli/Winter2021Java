package day15arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		//=====sort(), binarySearch()======
		//int a[]=new int[4];
		int a []= {4,2,1,5};
		System.out.println(Arrays.toString(a));
		
		//How can we sort the elements in array ?
		//sort() sorts the elements in ascending order
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		int num []= {9,5,1,8,7};
		//interview question
		//How can we sort num[] in descending order?
		//to sort arrays in descending order
		//1)use sort()
		//2)use loop to take elements one by one 
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		int reverse[]= new int[num.length];
		
		int idx=0;
		for(int i =num.length-1; i>=0 ; i--) {		
			reverse[idx]=num[i];	
			idx++;	
		}
		System.out.println(Arrays.toString(reverse));
		
		//How to check if a specific element exists in an array ?
		//1)Sort the array elements
		//2)Use binarySearch() , it gives you the index
		//We can use binarySearch() for all data types
		
		int num2[]= {3,12,8,7};
		Arrays.sort(num2);
		
		//to check if 3 exists in this array
		System.out.println(Arrays.binarySearch(num2, 3));//0==>INDEX
		System.out.println(Arrays.binarySearch(num2, 8));//2
		//What if I look for non-existing element?
		//It will return negative number and the number will be the ORDER
		System.out.println(Arrays.binarySearch(num2, 4));//-2 (imagine where would 4 be)
		System.out.println(Arrays.binarySearch(num2, 10));//-4
		
		//int num2[]= {3,8,12,8,7};
		//System.out.println(Arrays.binarySearch(num2, 8));
		//Do not use binarySearch() if there is repeated elements
		
		
		
		
		
		
		
		
		
		
	}

}
