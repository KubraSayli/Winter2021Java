package day12dowhilevariablesconstructors;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		//Ask user to enter an integer
	    //If the integer is even print on the console “You won!”
        //Otherwise ask user to enter another integer
		
		evenIntCheck();

	}
	
	public static void evenIntCheck() {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		
		do {
			System.out.println("Enter a number please");
		     a = scan.nextInt();
		     
		     
		}while(a%2!=0);
		System.out.println("You won!");
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
