 package k_day16_multidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
public static void main(String[] args) {
		//You can put primitives in array
	    //You can also put non-primitives, but when you can not put
	    //non primitives directly Java will put their references. 
	    //Array is an object, so I can also put array inside an array
		//!!!!!çiz
	   //  int arr[][] = new int [3][];
	   // print. ikinciye bir şey koymasan da olur 1 koy print et 2 koy 
	  //  System.out.println(Arrays.deepToString(arr));
	    // it s not possible to create inner arrays which has different size
	int arr[][] = { {7, 11, 5}, {71, 12}, {9} };
		
		
		//How to print a specific element
		System.out.println(arr[0][0]);//7
		System.out.println(arr[0][1]);//11
		System.out.println(arr[1][1]);//12
		
		//How to update "5" to 88
		arr[0][2] = 88;
		//update 9 to 19
		arr[2][0] = 19;
		
		//To print multidimensional arrays on the console, use deepToString() method
		System.out.println(Arrays.deepToString(arr));
		
		//How to print first array and last array (!!!try to do it)
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[2]));
		
		//How to find the sum of the elements of the first array 
		//[[7, 11, 88], [71, 12], [19]]
		
		int sum = 0;
		for(int i=0; i<arr[0].length; i++) {
			sum = sum + arr[0][i];
		}
		
		System.out.println(sum);
	}

}
