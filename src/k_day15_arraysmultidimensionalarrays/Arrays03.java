package k_day15_arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
	/*
	 =====split()======= > String Method 
	 split() is used to split a String by using specific charater/s
	 split() puts the splitted parts into an array 
	 */
	public static void main(String[] args) {
        String s = "I like Java but Java needs to study hard to learn so study hard";
       
        String part1 [] = s.split("Java");
		System.out.println(Arrays.toString(part1));//[I like ,  but ,  needs to study hard to learn so study hard]
		
		String words [] = s.split(" ");
		System.out.println(Arrays.toString(words));//[I, like, Java, but, Java, needs, to, study, hard, to, learn, so, study, hard]
		System.out.println(words.length);//14
		
		//Find the characters that are used in String "s" by using split
		String part2 [] = s.split("");
		System.out.println(Arrays.toString(part2));
		System.out.println(part2.length);//63
		
		//How many characters except space by using split ? 
		
		String part3[] = s.replace(" ", "").split("");
		System.out.println(Arrays.toString(part3));
		System.out.println(part3.length);//50
		
		//Count how many times "a" is used in the String s
	   String part4[]=s.split("a");
	   System.out.println(Arrays.toString(part4));
	   System.out.println(part4.length-1);//7
	    
	   
	   //OR
	   
	    String part5 []=s.split("");
		int counter = 0; 
		for(int i=0; i<part5.length; i++) {
			if(part5[i].equals("a")) {
				counter++;
			}
		}
		System.out.println("The number of the character" + counter);

		//Count the number of occurrence of every character in a String.
		//Test the code by using abaab, abaabc, abc
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s1 = scan.nextLine();
		
		
		String ch[] = s1.split("");
		System.out.println(Arrays.toString(ch));
		
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		
		int counter1 = 0;
		
		for(int i = 1; i< ch.length; i++) {
           if(ch[i-1].equals(ch[i])) {
				counter1++;
			}else {
				
				System.out.println("The number of " + ch[i-1] + " is: " + (counter1 + 1));
				counter1 = 0;
				
			}
			if(i==ch.length-1) {
				
				System.out.println("The number of " + ch[i] + " is: " + (counter1 + 1));
			}
		}
		scan.close();
		
	}

}
