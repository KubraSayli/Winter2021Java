package k_day21_accessmodifierstringbuilder;


public class StringBuilde02 {
		/*
		  1)To create a "mutable Strings" Java created "StringBuilder" class. If you create String by using 
	   "StringBuilder" class, the String will be mutable.
		 */
	public static void main(String[] args) {
		//to create StringBuilder:
		//1st way: if you add multiple characters you can use 1st way
		StringBuilder sb1 = new StringBuilder();
		sb1.append("String Builders");
		System.out.println(sb1);
		//We can use method chain:
		sb1.append(" are").append(" mutable");
		System.out.println(sb1);
		
		//2nd way:
		//If you re sure about the length, you can use this way to create a StringBuilder
		//The capacity of empty String is 16 by default. If you re sure about length
		//put number in constructor to save memory
		
		StringBuilder sb2 = new StringBuilder(9);
		System.out.println(sb2.capacity());//9
		sb2.append("Java");
		//capacity() returns the area that is reserved 
		//length() returns the number of the characters
		System.out.println(sb2.capacity());//9
		System.out.println(sb2.length());//4
		
		sb2.append(" is fun");
		System.out.println("Before trim: " + sb2.capacity());//20
		System.out.println(sb2.length());//11
		
		//If you want to remove unused reserved area from StringBuilder use trimToSize()
		sb2.trimToSize();
		System.out.println("After trim :" + sb2.capacity());//11
		
		
		//3rd way:
		StringBuilder sb3 = new StringBuilder("Zehra");
		sb3.append(" come home", 0, 10);
		System.out.println(sb3);
		System.out.println(sb2);
		sb3.append(sb2, 5,11);
		System.out.println(sb3);
		
		//To get a String character
		System.out.println(sb3.charAt(0));//Z
		
		//To delete a specific char
		//If the return type of the method you used is StrngBuilder the method updates
		//your original StringBuilder value.
		sb3.deleteCharAt(5);
		System.out.println(sb3);
		//To delete multiple characters 
		sb3.delete(5, 9);
		System.out.println(sb3);
		sb3.delete(5, sb3.length());
		System.out.println(sb3);
		
		//StringBuilder equals() method is different from String equals() method.
		//StringBuilder equals() method return true just for same objects. 
		//If you use StringBuilder equals() method with different objects 
		//whose values are same, you will get false.
		StringBuilder sb4 = new StringBuilder("Ayse");
		StringBuilder sb5 = new StringBuilder("Ayse");
		//!!System.out.println(sb3.equals("Zehra"));
		System.out.println(sb4.equals(sb5));//false
		
		System.out.println(sb4.indexOf("e"));//3
		sb4.insert(0, "Can");//works similar with list.add()
		System.out.println(sb4);//CanAyse
		sb4.insert(3, "kimn", 1, 3);
		System.out.println(sb4);//CanlmAyse
		sb4.replace(3, 5, "Can");
		System.out.println(sb4);//CanCanAyse
		//reverse() method is used to reverse a String
		sb4.reverse();
		System.out.println(sb4);//esyAnaCnaC
		//Reversing String is common interview at the beginning say I can use
		//reverse() from StringBuilder I can use it with loop as well
		
		//to update a character
		sb4.setCharAt(3, 'r');
		System.out.println(sb4);//esyrnaCnaC
		System.out.println(sb4.subSequence(3, 6));//rna
		
		sb4.toString();//toString() cannot update the original value of the StringBuilder.
		
		/*
		 Note: StringBuilder was added to Java in Java 5. 
If you come across older code, you will see StringBuffer used for this purpose. 
StringBuffer does the same thing but more slowly; therefore, use StringBuilder
        a)StringBuffer runs slow
	    b)StringBuffer can be used in "synchronization" but StringBuilder cannot.
		 */
	}

}
