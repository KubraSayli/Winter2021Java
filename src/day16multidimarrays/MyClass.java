package day16multidimarrays;

public class MyClass {

	public static void main(String[] args) {
		//Bee
		String arr[][]= {{"e","A","B","V"},{"B","e","L","f"},{"h","e","r","t"}};
		//By using arr print Bee on the console
		String s = "";
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				 if(i==0 && arr[i][j].equals("B")) {
					 s=s+arr[i][j];
					 break;
					 }else if(i!=0 && arr[i][j].equals("e")) {
					 s=s+arr[i][j];
					 break;
				 }	
		               
			}
			
		}
		System.out.println(s);

	}

}
