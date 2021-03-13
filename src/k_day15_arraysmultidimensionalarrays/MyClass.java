package k_day15_arraysmultidimensionalarrays;

import java.util.Arrays;

public class MyClass {
	public static void main(String[] args) {
		/*=====split()=======
		 split() is used to split a String by using specific character/s
		 split() puts the splitted parts into an array
		 */
		String s = "I like Java but Java needs to study hard to learn so study hard";
		String part1 [] = s.split("Java");
		System.out.println(Arrays.toString(part1));
		
		//How to we split a string as words ? 
		String part2[] = s.split(" ");
		System.out.println(Arrays.toString(part2));
		//The number of the words?
		System.out.println(part2.length);
		
		//Find the characters that are used in String s by using split()
		String part3 []= s.replace(" ", "").split("");
		System.out.println(Arrays.toString(part3));
		//Find the number of characters except for space
		System.out.println(part3.length);
		
		//How many times the "a" is used in the String s 
		String part4[]=s.split("a");
		System.out.println(Arrays.toString(part4));
		System.out.println(part4.length-1);
		
		//or
		
		String part5[]=s.split("");
		int counter  = 0;
		for(int i = 0 ; i<part5.length; i++) {
			if(part5[i].equals("a")) {
				counter++;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
