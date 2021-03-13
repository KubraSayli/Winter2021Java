package k_day08_stringmethodcreation;

public class StringMethods01 {
public static void main(String[] args) {
		
		String str = " Java is Java ";
		
		//19) trim() method is used to delete space character JUST from the beginning and from the end of the String
		System.out.println(str.length());//" Java is Java " ==> 14
		System.out.println(str.trim().length());//"Java is Java" ==> 12
		//If you use methods together in the same line , it is called "method chain"
		/*
		  By using String methods change the String "  Ali123 can?!@   "     ===>    "Ali CAN"
		*/
		
		String str1 = "  Ali123 can?!@   ";
		
		//1.Way
		System.out.println(str1.replaceAll("\\W", "").replace("123", " ").replace("can", "CAN"));
		
		//2.Way
		String firstname = str1.substring(2, 5);
		String lastname = str1.substring(9,12).toUpperCase();
		System.out.println(firstname + " " + lastname);
		
		//20) concat() method is used to join Strings. 
		//"+" and "concat()" does the same. But I recommend to use "concat()" instead of "+"
		System.out.println(firstname.concat(" ").concat(lastname));
		
		//3.Way
		System.out.println(str1.trim().replaceAll("\\d", "").replace("can?!@", "CAN"));
	
		 //!!!!!pen
		/*
		 	String str2 = "$12.99";
		 	String str3 = "$8.00";
		 	Find the sum of str2 and str3.
		*/
		
		String str2 = "$12.99";
	 	String str3 = "$8.00";
	 	
	 	//!!!! first replace $ and print and try to add them. It's going to be concatination
	 	//then convert them int and replace .
		
		String s2 = str2.replace("$", "").replace(".", "");
		String s3 = str3.replace("$", "").replace(".", "");
		
		System.out.println(s2);
		System.out.println(s3);
		
		//parseInt() method converts Strings to integer, if and only if the String is created just by digits.
		System.out.println((Integer.parseInt(s2) + Integer.parseInt(s3))/100.0);
		//valueOf() method converts Strings to integer, if and only if the String is created just by digits.
		System.out.println((Integer.valueOf(s2) + Integer.valueOf(s3))/100.0);
		
		//How to convert String to a decimal
		String str4 = "$13.99";
		String str5 = "$9.00";
		
		String s4 = str4.replace("$", "");
		String s5 = str5.replace("$", "");
		
		System.out.println(s4);//13.99
		System.out.println(s5);//9.00
		
		System.out.println(Double.parseDouble(s4) + Double.parseDouble(s5));//22.99
		System.out.println(Double.valueOf(s4) + Double.valueOf(s5));//22.99
		
		//How do we convert number to String ?

	}
}
