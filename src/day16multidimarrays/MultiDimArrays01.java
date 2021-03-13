package day16multidimarrays;

import java.util.Arrays;

public class MultiDimArrays01 {

	public static void main(String[] args) {
		//You can put primitives in arrays
		//You can put references of non primitives in arrays
		//Arrays are objects, so we can put arrays in an array
		
		int arr[][]=new int[3][2];
		//to print multi dimensional arrays:
		System.out.println(Arrays.deepToString(arr));
		arr[0][0]=1;
		System.out.println(Arrays.deepToString(arr));
		arr[1][1]=1;
		System.out.println(Arrays.deepToString(arr));
		
		//it is not possible to create inner arrays which has different sizes
		
	    int brr[][]= {{2,4,1},{7,9},{10,11}};
		System.out.println(Arrays.deepToString(brr));
		//How to update elemets in multi dimensional array?
		//Update 10 to 7
		brr[2][0]=7;
		//Update 1 to 5
		brr[0][2]=5;
		System.out.println(Arrays.deepToString(brr));
		
		//How to print first array and last array of brr?
		System.out.println(Arrays.toString(brr[0]));
		System.out.println(Arrays.toString(brr[2]));
		
	    //How to find the sum of the elements in second array ? 
		int sum=0;
		for(int i=0; i<brr[1].length; i++) {
			sum=sum+brr[1][i];
		}
		System.out.println(sum);
	
	}

}
