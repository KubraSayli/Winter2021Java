package day10loops;

import java.util.Scanner;

public class WhileLoop03 {
	public static void main(String[] args) {
		factorial();
	}
	
	/*
	  Interview Question
	  Get an integer from user and calculate the factorial
	  For example; user --> 5 ==> 5!=1x2x3x4x5 = 120
	*/
	
	public static void factorial() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int d = scan.nextInt();
		
		int i = 1;
		int result = 1;
		
		while(i<=d) {
			
			result = result * i;
			
			i++;
		}
		
		System.out.println(result);
		
		scan.close();
	}
}
