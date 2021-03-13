package day11whileloopdowhileloopp;

import java.util.Scanner;

public class Whileloop01 {

	public static void main(String[] args) {
		/*
		 Type java code by using while loop,
		         Write a program that prompts the user to input an integer.
		         It should then find sum of the digits of that number.
		         	123 ==> 1+2+3 = 6
		 */
		addDigits();
	}
	public static void addDigits() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number please");
		int num = scan.nextInt();
		if(num<0) {
			num=num*-1;
		}
		int sum = 0;
		while(num!=0) {
			sum = sum+num%10;
			num/=10;
		}
		System.out.println("The sum of digits is : "+ sum);
		scan.close();		
		
	}
	

}
