package k_day15_arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		//How do we create arrays?
		//int a []= new int[5]; //main method
	
	    int num[]= {4,1,6,3};
	    //print ?? 
	    System.out.println(Arrays.toString(num));
	    //args[0]="Ali";
	   //System.out.println(Arrays.toString(args));
	   
	    //How to sort the array elements ? 
	    Arrays.sort(num);
	    System.out.println(Arrays.toString(num));
	   
	    int a[]= {9,5,12,4,0};
	   //How to sort array elements in descending order ? 
//	    int i = num.length-1;
//	    while(i>=0) {
//	    	System.out.print(num[i]+",");
//	        i--;
//	    }
	    
	    //interview question
	    //to sort elements in descending order;
	      //1. use sort() (sort them in ascending order)
	      //2. use loop to print them one by one.
        
	    // !!! böyle yapsak length 0. a.length dynamic not hard coded
	    //  int reverse[]= {};
	    int reverse [] = new int[a.length];//Created a new array to store reversed array 
	    Arrays.sort(a);
	    int idx=0;
	   for (int i = a.length-1 ; i>=0; i--) {
		   // System.out.print(a[i]+" "); //böyle yapsak array olmaz 
		   //reverse[a.length-1-i]=a[i];
		   reverse[idx]=a[i];
		   idx++;
		//   System.out.println(Arrays.toString(reverse));
	   }
	    System.out.println(Arrays.toString(reverse));
	    
	    //if you want to solve with one index : 
//	    
	    System.out.println(Arrays.toString(reverse));
	    
	    //How to check if a specific element exists in an Array ? 
	    //1)Sort the array element 
	    //2)Use binary earch() method, it will give you index
	    //Note : If you use binarySearch() without sort(), you ll get result
	    //       but it is not meaningful
	    int num2[]= {3,8,12,7};
	    System.out.println(Arrays.toString(num2));//[3, 8, 1, 7]
	    Arrays.sort(num2);
	    //What is your estimation ? 
	    //If an element does not exist in the array, Java returns the order number with negative sign
	    System.out.println(Arrays.binarySearch(num2, 12));//gives the index of 12 after sorting
	    System.out.println(Arrays.binarySearch(num2, 5));//imagine where 5 would be , it gives you the negative of that number 
	    System.out.println(Arrays.binarySearch(num2, 18));
	    System.out.println(Arrays.binarySearch(num2, -5));
	    //we can use binarySearch() for all data types
	    
	    //!!!!slide
	    
	    
	    
	    
	    
	    
	    
	}

}
