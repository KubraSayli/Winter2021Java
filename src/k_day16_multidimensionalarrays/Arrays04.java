package k_day16_multidimensionalarrays;

public class Arrays04 {

	public static void main(String[] args) {
		String arr[][] = { {"A", "B", "M", "Y"}, {"K", "e","T"}, {"L", "X", "e","W"} };
		//By using given multidimesional array, print "Bee" on the console
		
		String s = "";
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				if(arr[i][j].equals("B")) {
					s = s + arr[i][j];
					break;
					
				}else if(arr[i][j].equals("e")) {
					s = s + arr[i][j];
					break;
				}
			}
			
		}
		System.out.println(s);
		
		
		
		
		
		
		
		
		
	}

}
