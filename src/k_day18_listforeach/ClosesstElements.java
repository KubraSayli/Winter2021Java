package k_day18_listforeach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ClosesstElements {
	/*
    From an integer list find the closest two elements
*/

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<10 ; i++) {
			list.add(scan.nextInt());
		}
	/*	list.add(50);
		list.add(30);
		list.add(4);
		list.add(66);
		list.add(78);
		list.add(97);
		list.add(43);
		list.add(12);
		list.add(33);
		list.add(45);*/
		
		//[50, 30, 4, 66, 78, 97, 43, 12, 33, 45]
		//[4, 12, 30, 33, 43, 45, 50, 66, 78, 97]
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		int min=Integer.MAX_VALUE;
		int gap=0,gap1=0,gap2=0;
		
		for(int i=0; i<list.size()-1 ; i++) {
			gap=list.get(i+1)-list.get(i);
			if(min>gap) {
				min=gap;
				gap1=list.get(i);
				gap2=list.get(i+1);
				}
		}
		
		System.out.println("the gap is: " + min + " num1 is: " + gap1 + " num2 is: " + gap2);
	
	}
}
