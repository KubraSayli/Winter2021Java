package k_day03wrapperclassconcatenatelogicaloperators;

import java.util.Scanner;

public class ModulusOperator01 {

	public static void main(String[] args) {
		
		/*
		 Ask user to enter 3 digits number. 
		 Type a program to find the 
		 sum of digits. 
		 For example ==> 678 ==> 6+7+8
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three digits integer");
		int num = scan.nextInt();
		
		//num = abc
		int c = num%10;
		
		int num1 = num/10;
		int b = num1%10;
		
		int a = num/100;
		
		int sum = a+b+c;
		
		System.out.println("The sum of digits is : "+ sum);
		
		
	}

}
