package day12doWhileLoop;

import java.util.Scanner;

public class DoWhile02 {
	public static void main(String[] args) {
		checkInitial();
	}
	/*
	 	 Ask user to enter his/her first name
		 If the initial is lower case print a message like "Make the initial upper case"
		 If the initial is upper case print a message like "You did it right"
	*/
	public static void checkInitial() {
		
		Scanner scan = new Scanner(System.in);
		//!!! önce do nun içine yaz:
		System.out.println("Enter your first name");
		String fn = "";
		
		do {
			
			fn = scan.next();
			
			if(fn.charAt(0)>='A' && fn.charAt(0)<='Z') {
				System.out.println("You did it correct!...");
			}else {
				System.out.println("Please, make the initial uppercase");
			}
			
		}while(!(fn.charAt(0)>='A' && fn.charAt(0)<='Z'));
		
		scan.close();
	}
}
