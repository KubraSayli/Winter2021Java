package k_day07_stringmethods;

public class StringManipulation00 {
	/*
 	String Methods:
 	1)toUpperCase() 2)toLowerCase() 3)charAt()      4)equals()            5)equalsIgnoreCase()    6)length()
 	7)next()        8)nextLine()    9)indexOf()     10)lastIndexOf()	  11)contains()
 */

public static void main(String[] args) {
	
	String str = "Java is easy if you study";
	
	//9)indexOf() returns the index of first occurrence of the character
		System.out.println(str.indexOf("i"));//5
		//indexOf() accepts char as parameter as well
		System.out.println(str.indexOf('i'));//5
		//If the character does not exist in the String, it returns "-1"
		System.out.println(str.indexOf("x"));//-1
		//If you use multiple characters in indexOf(), it returns the index of first character
		System.out.println(str.indexOf("easy"));//8
		//If you use indexOf() with 2 parameters, Java looks for the character after the given index.
		//Second parameter is inclusive
		System.out.println(str.indexOf('e', 8));//8
	
	/*
	 Ask user to enter a String and a character, then check if the String has the character	or not
	*/
//	Scanner scan = new Scanner(System.in);
//	System.out.println("Enter a String the enter a character");
//	String s = scan.nextLine();
//	char ch = scan.next().charAt(0);
//	
//	String result = s.indexOf(ch)==-1 ? "The String has no the character" : "The String has the character";
//	System.out.println(result);
		
	//10)lastIndexOf() returns the index of last occurrence of the character	
	String t = "Java ah Java!";
	
	//In lastIndexOf() method you can use char and String. Both are acceptable
	System.out.println(t.lastIndexOf('a'));//11
	System.out.println(t.lastIndexOf("a"));//11
	//lastIndexOf() method returns -1, if the character does not exist in the String
	System.out.println(t.lastIndexOf("w"));//-1
	//lastIndexOf() returns the index of first character of last occurrence of "Java"
	System.out.println(t.lastIndexOf("Java"));//8
	//If you use lastIndexOf() with 2 parameters, get the character starting with the index and to the begining of the String
	//In the following example we are usen "Java a"
	System.out.println(t.lastIndexOf("v", 5));
	
	/*
	 	Ask user to give you a String and a character.
	 	If the character does not exist in the String or exists just once, print "Not good!"
	 	If the character is used multiple times print "Wooow!".
	*/
//	System.out.println("Enter a String the enter a character");
//	String s = scan.nextLine();
//	char ch = scan.next().charAt(0);
//		
//    if(s.indexOf(ch)==-1 || s.indexOf(ch)==s.lastIndexOf(ch)) {
//    	System.out.println("Not good!");
//    }
//    if(s.indexOf(ch) != s.lastIndexOf(ch)) {
//    	System.out.println("Wooow!");
//    }
		
	//11)contains()	is used to check if a single character or multiple characters exist in a String
	// contains() method returns boolean
	// contains() method cannot be used with chars, you have to use Strings
	String r = "Learn Java, earn money";	
	System.out.println(r.contains("e"));//true	
	System.out.println(r.contains("x"));//false
	
	System.out.println(r.contains("earn"));//true
	
	
		
		
	

}
}
