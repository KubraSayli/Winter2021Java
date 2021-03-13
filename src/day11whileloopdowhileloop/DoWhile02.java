package day11whileloopdowhileloop;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		/*
		 For the String “1234_?!abcdef”, type a code to count the number of letters,
		 the number of digits and the number of others by using do-while loop
		 */
		countChars();
	}
	
	public static void countChars() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String please");
		String str = scan.next();
		
		//String str = "12334_*?!aabcdefy";
		int i = 0;
		String letters =""; 
		String numbers=""; 
		String others="";
	
		do {
			char c = str.charAt(i);
			if((c>='A' && c<='Z') ||(c>='a' && c<='z')) {
				letters+=c;
				i++;
			}else if(c>='0' && c<='9') {
				numbers+=c;
				i++;
				
			}else {
				others+=c;
				i++;
			}
			
		}while(i<str.length());
	
		System.out.println("The number of letters is: " +letters.length());
		System.out.println("The number of numbers is: " +numbers.length());
		System.out.println("The number of other characters is: " +others.length());
			
		scan.close();
	}
	
}



