package day16multidimarrays;

public class MultiDimArrays03 {

	public static void main(String[] args) {
		String arr[][]= {{"s","A","D","B"},{"R","t","e"},{"u","o","Y","e"}};
		//By using given String array print Bee on the console
		
		String s="";
		for(int i=0; i<arr.length; i++) {
			
			s=s+arr[i][arr[i].length-1];
			
		}
 
		System.out.println(s);
		

		//Find the mutiplication of the first elements in each array
		int brr[][]= {{2,4,5},{1,5,7,8,9},{5},{8,5}};
		
		int product = 1;
		
		for(int i=0; i<brr.length; i++) {
			product=product*brr[i][0];
		}
		System.out.println(product);
		
	}

}
