package k_day07_stringmethods;

import java.util.Scanner;

public class StringManipulation01Class {
	/*
	 RECALL : 
	 String Methods:
1)toUpperCase() 2)toLowerCase() 3)charAt()      4)equals()            5)equalsIgnoreCase()    6)length()
7)next()        8)nextLine()    9)indexOf()     10)lastIndexOf()	  11)contains()
	 */

	public static void main(String[] args) {
		
		String str1 = "Learn coding by typing";
		
		//12.
		//startsWith() it is used for to check if this String starts with the specified prefix.
		//startsWith() can be used with only Strings. We can't use it with char
		//startsWith() can be used with more than one characters
		//startsWith() returns boolean
		
		System.out.println(str1.startsWith("L"));//true

		   
		//Case sensitive !!!
		System.out.println(str1.startsWith("l"));//false
	
		// !!!!  //Can we use it with char ?   System.out.println(str.startsWith('L'));
		
		System.out.println(str1.startsWith("Learn"));//true
		//You can check with as much as characters as you want :
		System.out.println(str1.startsWith("Lea"));//true
		 //to check the character in a specific index :
	    System.out.println(str1.startsWith("c", 6));//true (skip 6 characters, check if the rest starts with c)
	    System.out.println(str1.startsWith("by", 13));//true
		
       //Ask user to enter the price check if the price starts with $
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the price of the product");
	    String price = scan.next();
	    
	    
	    if (price.startsWith("$")) {
	    	System.out.println("Price is in expected format");
	    } else {
	    	System.out.println("Price is not expected format");
	    }
	     
		
		//13.
		//endsWith() it is used for to check if this String ends with the specified suffix.
		//endsWith() can be used with only Strings. We can't use it with char
		//endsWith() can be used with more than one character
		//endsWith() returns boolean
		System.out.println(str1.endsWith("g"));//true
	    System.out.println(str1.endsWith("m"));//false 
	    System.out.println(str1.endsWith("ping"));//true
	 
	    
	    //14.Str
	    //isEmpty returns "true" means the length of the String is 0, otherwise it returns false
	    System.out.println(str1.isEmpty());//false
	    String s = "";
	    System.out.println(s.isEmpty());//true
	    
	    //15.
	    //to replace all occurrences of first character/s in this string with second character/s 
	    String str2 = "Java is easy";
	    System.out.println(str2.replace("a", "t"));//Jtvt is etsy
	    //!!!!alt shift r
	    //!!!! What if I want my String back ? 
	    //!!!! It didn't change
	    System.out.println(str2);//Java is easy
	    //so it is temporary update
	    
	    //br
	    System.out.println(str2.replace("Jav", "Tav"));//Tava is easy
	    System.out.println(str2.replace("a", "?????"));//J?????v????? is e?????sy
	    System.out.println(str2.replace("ava", "s"));//Js is easy
	    System.out.println(str2.replace("a", str2));//JJava is easyvJava is easy is eJava is easysy
	    //How can I delete all "a" ?
	    System.out.println(str2.replace("a", ""));//Jv is esy
	    //replace ! before and after each character:
	    System.out.println(str2.replace("", "!"));//!J!a!v!a! !i!s! !e!a!s!y!
	    //Remove all the spaces:
	    System.out.println(str2.replace(" ",""));//Javaiseasy
	    //Can we replace char s?
	    System.out.println(str2.replace('s', 'a'));//Java is eaay
	    //Can I use both String and char at the same time ? no
	    //If you use ' ' it accepts just one char
	    //charSequence means String
	    
	    //16.
	    //replaceAll()
	    System.out.println(str2.replaceAll("a", "t"));
	  //replaceAll() does the same with the replace().
	  		//   But there are some differences 1) In replaceAll() you cannot use chars, in replace() you can
	  		//                                  2) In replaceAll() you can use "Regular Expression"s
	    
	    
	    String str3 = "Teach_more, learn123 more!!!  ..";
	    
	    //   \\s: space character
	   System.out.println( str3.replaceAll("\\s", "#"));//Teach_more,#learn123#more!!!##..
	    
	    
	   /* Regular Expressions ==>  1) \\s: space character
								   2) \\S: all characters except space character
								   3) \\w: a->z 	A->Z	_    0->9
								   4) \\W: All characters except a->z 	A->Z	_    0->9
								   5) \\d: 0 -> 9
								   6) \\D: All characters except 0 -> 9
*/
	   //   \\S: all characters except space character:
	    System.out.println(str3.replaceAll("\\S", "*"));//*********** ******** *******  **
	    
	   //   \\w: a->z 	A->Z	_    0->9 :
	    System.out.println(str3.replaceAll("\\w", "/"));////////////, //////// ////!!!  ..
	    
	    //  \\W: All characters except a->z 	A->Z	_    0->9 
	    System.out.println(str3.replaceAll("\\W", "*"));//Teach_more**learn123*more*******
	    
	    //  \\d: 0 -> 9
	    System.out.println(str3.replaceAll("\\d", "*"));//Teach_more, learn*** more!!!  ..
	    
	    //  \\D: All characters except 0 -> 9
	    System.out.println(str3.replaceAll("\\D", "&"));//&&&&&&&&&&&&&&&&&123&&&&&&&&&&&&
	    
	    
	    //17.replaceFirst() changes just the first occurrence of the character
	    System.out.println(str3.replaceFirst("e", "a"));//Taach_more, learn123 more!!!  ..
	    
	    scan.close();
	    
	    
}
}