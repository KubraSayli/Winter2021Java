package day12doWhileLoop;

import java.util.Scanner;

public class DoWhile01 {
//	Ask user to enter an integer
//  If the integer is even print on the console “You won!”
//	 Otherwise ask user to enter another integer
	
	public static void main(String[] args) {
			
		evenIntCheck();
		
	}
	public static void evenIntCheck() {
		Scanner scan = new Scanner(System.in);
		//!!!first, create it in loop:
		int a = 0;
		do {
			//!!!yerini deðiþtir
			System.out.println("Enter an integer please: ");
			a = scan.nextInt();
			
		}while(a%2!=0);
		
		System.out.println("You won!");
		scan.close();
	}
}
