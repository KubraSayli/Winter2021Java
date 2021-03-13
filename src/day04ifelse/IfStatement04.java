package day04ifelse;

import java.util.Scanner;

public class IfStatement04 {

	public static void main(String[] args) {
		/*
		 Ask user to enter the values of length and width of a rectangle then check
		 if it is square or not
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the width of the rectangle");
		double width = scan.nextDouble();
		System.out.println("Enter the length of the rectangle");
		double length = scan.nextDouble();
		
		if(width<=0 || length<=0) {
			System.out.println("Width and length have to be positive numbers");
		}else {
			 if(width == length ) {
				 System.out.println("Square");
			 }else {
				 System.out.println("Rectangle");
			 }
		}
		
		
		
		
		
		
//		if(width<=0 || length<=0) {
//			System.out.println("Enter valid values");
//		}
//		
//		if(width == length) {
//			System.out.println("Square");
//		}
//		if(width != length) {
//			System.out.println("Rectangle");
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
