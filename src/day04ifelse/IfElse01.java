package day04ifelse;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
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
		

	}

}
