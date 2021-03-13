package day04ifelse;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {

		/*
		 Type java code by using if statement
		 When you enter the name of the day a week, 
		 output will be "Weekday" or "Weekend day" according to the name of the day
		 Get the name of the name from user
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of a day");
		String dayName = scan.next().toLowerCase();
		
		//to compare Strings DO NOT use "=="sign. We use it for primitives
		//Use equals() to compare Strings
		//How do I use equals()? "Ali".equals("Veli") ==> false
	//                           "Ali".equals("Ali") ==> true
		//						"Ali".equals("ali") ==> false
		
		if(dayName.equals("monday") || dayName.equals("tuesday") || dayName.equals("wednesday") ||
				dayName.equals("thursday") || dayName.equals("friday") ) {
			System.out.println("Weekdays");
		}
		if(dayName.equals("saturday") || dayName.equals("sunday") ) {
			System.out.println("Weekend");
		}
		
		if( !dayName.equals("monday") && !dayName.equals("tuesday") && !dayName.equals("wednesday") && 
				!dayName.equals("friday") && !dayName.equals("thursday") && !dayName.equals("saturday") && 
				!dayName.equals("sunday") ) {
			System.out.println("Enter a valid day name");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
