package k_day16_multidimensionalarrays;

public class Arrays03 {
	public static void main(String[] args) {
		
		String arr[][] = { {"A", "Y", "M", "B"}, {"K", "e"}, {"L", "X", "e"} };
		//By using given multidimesional array, print "Bee" on the console
		
		String s = "";
		
		for(int i=0; i<arr.length; i++) {	
				s = s + arr[i][arr[i].length - 1];
		}
		
		System.out.println(s);
		
		
		//Homework
		//Find the multiplication of the first elements in every array
		int brr[][] = { {32, 12, 11}, {21, 34}, {3} };
		
		int prod = 1;
		
		for(int i=0; i<brr.length; i++) {
			prod = prod * brr[i][0];
		}
		
		System.out.println(prod);
	}

}
