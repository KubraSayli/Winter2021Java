package day21accessmodifiersstringbuilders;

public class StringBuilder01 {

	/*
	To create "mutable Strings" Java created String Builder class. If you create a String
	by using String Builder class, the String is going to be "mutable"
	 */
	public static void main(String[] args) {
		//to create a StringBuilder:
		//1st way:
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.capacity());
		sb1.append("String Buliders ");
		//append() can be used in method chain
		sb1.append("are").append(" mutable");
		System.out.println(sb1);
		
		//2nd way:
		//If you re sure about the length of String use this way to save memory
		//The capacity of empty String is 16 by default
		StringBuilder sb2 = new StringBuilder(9);
		sb2.append("Java");
		System.out.println(sb2);
		System.out.println(sb2.capacity());//9
		System.out.println(sb2.length());//4
		sb2.append(" is fun");
		System.out.println(sb2);
		System.out.println(sb2.length());//11
		System.out.println("Before trim:" + sb2.capacity());//20
		
		//trimToSize() removes the area that is not used
		sb2.trimToSize();
		System.out.println("After trim: "+sb2.capacity());
		
		//3rd way:
		StringBuilder sb3 = new StringBuilder("Erol Demiray");
		sb3.append(" come home", 0, 5);
		System.out.println(sb3);//Erol Demiray come
		sb3.append(sb2, 2, 5);
		System.out.println(sb3);//Erol Demiray comeva
		
		//to get a specific character
		System.out.println(sb3.charAt(1));//r
		
		//to delete a specific character:
		sb3.deleteCharAt(7);
		System.out.println(sb3);//Erol Deiray comeva 

		//to delete a part of String
		sb3.delete(11,sb3.length());
		System.out.println(sb3);
		
		
		StringBuilder sb4 = new StringBuilder("Melike");
		System.out.println(sb4.equals("Melike"));//false
		//StringBuilder equals() works different from Strings
		//In StringBuilder class == sign is used to check equality.
		
		StringBuilder sb5 = new StringBuilder("Melike");
		System.out.println(sb4.equals(sb5));//false
		
		//to convert String Builder to a String
		//it will not be String permanently
		sb4.toString(); 
		
		//to compare same values first convert them to String by using toString()
		//then use equal() in String class
		System.out.println(sb4.toString().equals(sb5.toString()));//true
		
		//compareTo() method returns true if values are same
		System.out.println(sb4.compareTo(sb5));//0
		System.out.println(sb4.compareTo(sb3));//8
		
		System.out.println(sb4.indexOf("e"));//1
		
		//to insert a String to a specific index:
		sb4.insert(0, "Kilic");
		System.out.println(sb4);//KilicMelike
		sb4.insert(5, "X");
		System.out.println(sb4);
		//to replace a specific part of a String
		sb4.replace(5, 8, "XXXXX");
		System.out.println(sb4);
		
		sb4.reverse();
		System.out.println(sb4);//ekilXXXXXciliK
		
		//to update a char in a specific index:
		sb4.setCharAt(1,'t');
		System.out.println(sb4);//etilXXXXXciliK
		
		System.out.println(sb4.subSequence(4, 9));//XXXXX
		
		//Interview Question
		//Reverse this String without using reverse()
		String s = "Ankara";
		
		 for ( int i = s.length()-1 ; i >= 0 ; i--) {
	            System.out.print(s.charAt(i));
	        }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
