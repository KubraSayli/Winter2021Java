package day18Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lists03 {
   //From an integer list find the closest two elements (take List elements from user)
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 7 integers please");
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<7; i++) {
			list.add(scan.nextInt());
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		int min = Integer.MAX_VALUE;
		int difference = 0, num1=0, num2=0;
		for(int i=0; i<list.size()-1; i++) {
			difference=list.get(i+1)-list.get(i);
			if(min>difference) {
				min=difference;
				num1=list.get(i);
				num2=list.get(i+1);
			}
			
		}
		
		System.out.println("The difference is: "+min+", num1 is:"+num1+" , num2 is:"+num2);
				
	}

}
