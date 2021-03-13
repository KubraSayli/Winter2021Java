package k_day07_stringmethods;

import java.util.Scanner;

public class Substring01Class {
	public static void main(String[] args) {
		/*
		 A part of string is called the substring. 
		 The java substring() method of String class is used for getting a substring from the string.
		 We use substring() to get a part of the String by using indexes
		 
		 */

		String s1 = "Java is Java";
		//!!! When you click substring it says give me the beginning index
		System.out.println(s1.substring(5)); //is Java
		
		//!!! index is inclusive
		System.out.println(s1.substring(7)); // Java
		//System.out.println(s1.substring(0)) and System.out.println(s1) are same
		System.out.println(s1.substring(0)); //Java is Java
		////If you use last index it return s last character because indexes used in substring() are inclusive
		System.out.println(s1.substring(11));//a
		//If you use length in substring() method, it returns "nothing"
		System.out.println(s1.substring(12));
		//If you use any index greater than the length, it return "StringIndexOutOfBoundsException"
		//System.out.println(s1.substring(13));
		//!!!!!-1 shows you re out of 1 if it was 14 it would be 14
		
		/*
	 	Ask user to enter a String 
	 	If the first and the last character of the String are same
	 	print "Wooow!" otherwise, print "Hmmmm!" on the console
	*/
		
		Scanner scan = new Scanner(System.in);
     	System.out.println("Enter a String...");
		String s = scan.nextLine();
		/* String s3 = "Ayse";
		!!!!!
		 * System.out.println(s3.substring(3));//e System.out.println(s3.length());//4
		 * System.out.println(s3.length()-1);//3
		 */		//length()-1 every time gives you the last index
		String last = s.substring(s.length()-1);
		//substring() can be used with 2 parameters. 
		//First parameter is starting index(inclusive), second parameter is ending index(exclusive)
		
		//!!!!char  first = s.charAt(0);//!!grey underline : different things can not be compared
		//!!!So if you use substring , use substring when compare 
		String first = s.substring(0,1);
		
		if(last.equals(first)) {
			System.out.println("Wooww!!");
		}else {
			System.out.println("Hmmmmm!!!");
		}
		
		String s2 = "Java is an OOP language";
		//How do you get "Java is an OOP"
		System.out.println(s2.substring(0,14));
		//How can you get just i?
		System.out.println(s2.substring(5,6));
		System.out.println(s2.substring(3,3));//nothing
		
		//In substring(), starting index cannot be larger than ending index.
		//If you do it you get StringIndexOutOfBoundsException:
		//System.out.println(s2.substring(5,4));
		
		/*
	 	When we type codes we may get 2 types of error messages
	 	1)While you type code you may get "red underline", this type of error is called "Compile Time Error"
	 	2)While you type code you do not get any "red underline", but after you run the code, you will get 
	 	  some red messages on the console. That kind of errors are called "Run Time Error"
	 */
		//Convert language to LANGUAGE
		
		//Easy way : 
		System.out.println(s2.replace("language", "LANGUAGE"));
		
		//By using substring() and uppercase() methods
		System.out.println(s2.substring(0, 15)+s2.substring(15, 23).toUpperCase());
		
		
		//14.toLowerCase()
				String s3="Teach more learn more";
				System.out.println(s3.toLowerCase()); //teach more learn more
				
				//15.toUpperCase()
				
				System.out.println(s3.toUpperCase());//TEACH MORE LEARN MORE
				
				//by using String s3, convert just teach to upper case
				
				System.out.println(s3.substring(0 , 5).toUpperCase()+s2.substring(5));
				
				//Convert more to MORE by using uppercase method
				//System.out.println(s3.replace("more", "MORE"));
				System.out.println(s3.substring(0 ,6) + s3.substring(6, 10).toUpperCase()+ 
						s3.substring(10, 17) +  s3.substring(17).toUpperCase()); //Teach MORE learn MORE
				
				//16.
				String s4 = "  Java is a programming language  ";
				System.out.println(s3.trim());
	}
}
