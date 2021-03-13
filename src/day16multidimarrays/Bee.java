package day16multidimarrays;

public class Bee {
	public static void main(String[] args) {
		
		String arr1[][]= {{"A","B","V"},{"e","L","f"},{"h","e","r","t"}};
		String arr2[][]= {{"e","A","B","V"},{"B","e","L","f"},{"h","e","r","t"}};
		String arr3[][]= {{"A","V"},{"B","L","f"},{"h","e","r","t"}};
		printBee(arr1);
		printBee(arr2);
		printBee(arr3);
	}
	public static void printBee(String[][] arr) {
		String s = "";
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				 if(arr[i][j].equals("B")) {
					 if(s.isEmpty()) {
					 s=s+arr[i][j];
					}
				 }
				 else if(arr[i][j].equals("e")) {
					 if(s.equals("B") || s.equals("Be")) {
					 s=s+arr[i][j];
					 break;
					 }
				 }	
			}
		}
		if(s.length()<3)
			System.out.println("Not enough char to write Bee");
		else
			System.out.println(s);
		
	}
}
