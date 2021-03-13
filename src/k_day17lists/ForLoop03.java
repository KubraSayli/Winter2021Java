package k_day17lists;

import java.util.Arrays;
import java.util.Scanner;

public class ForLoop03 {
	public static void main(String[] args) {
		/*
		 * Ask user to enter a String and count the vowels (a,e,i,o,u) contained in the String
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String to see number of vowels");
		String s = scan.nextLine().toLowerCase();
		
		String ch[] = s.split("");
		System.out.println(Arrays.toString(ch));
		
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		
		for(String w : ch) {
			switch(w) {
				case "a":
					aCount++;
					break;
				case "e":
					eCount++;
					break;
				case "i":
					iCount++;
					break;
				case "o":
					oCount++;
					break;
				case "u":
					uCount++;
					break;
			}
		}
		System.out.println("The number of a " + aCount);
		System.out.println("The number of e " + eCount);
		System.out.println("The number of i " + iCount);
		System.out.println("The number of o " + oCount);
		System.out.println("The number of u " + uCount);
	 scan.close();
	}
}
