package day11whileloopdowhileloopp;

public class DoWhile03 {

	public static void main(String[] args) {
		/*
		 For the String "1234_?!abcdef", type a code to count the number of letters, 
	 the number of digits and the number of others by using do-while loop
		 */
		countChars();
	}
	
	public static void countChars() {
		String str = "1234_?!abcdef";
		String letters = "";
		String numbers = "";
		String others ="";
		int i = 0;
		
		do {
			char c = str.charAt(i);
			if((c>='A'&& c<='Z') || (c>='a'&& c<='z')) {
				letters += c;
				i++;
			}else if(c>='0' && c<='9') {
				numbers += c;
				i++;
			}else {
				others+=c;
				i++;
			}
			
		}while(i<str.length());
		System.out.println("The number of letters is : "+ letters.length());
		System.out.println("The number of numbers is : "+ numbers.length());
		System.out.println("The number of others is : "+ others.length());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
