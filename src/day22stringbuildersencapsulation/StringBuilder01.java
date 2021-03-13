package day22stringbuildersencapsulation;

public class StringBuilder01 {
	/*
	 String is immutable , because of this when you want to update a String JVM needs to do many 
	 tasks like removing unused containers and put the Strings in new container 
	 */
public static void main(String[] args) {
	String s = "Java";
	String s1 = s.concat("x");
	System.out.println(s);
	
	//StringBuffer is created to update String easily but Java made it thread-safe and synchronized
	//that features made StringBuffer slow. Then after Java5, Java developers created String Builder
	//which is not thread-safe and not synchronized. So it is faster than StringBuffers
	StringBuffer sbf = new StringBuffer("Java");
	sbf.append("x");
	System.out.println(sbf);
	
	//As a result if you want to work with updated Strings and if you don't need a thread safe functionality
	//use StringBuilders
	StringBuilder sb = new StringBuilder("Java");
	sb.append("x");
	System.out.println(sb);
	
}
}
