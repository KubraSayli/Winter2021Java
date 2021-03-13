package k_day17lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List01k {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Mary");
		list1.add(1, "Angie");
		list1.add("Veli"); //index e 4 yazmana gerek yok sadece add yazarsan da sona ekler 
		System.out.println(list1);
		
		//to find the number of elements in List:
		System.out.println(list1.size());
		System.out.println(list1.get(2));//Veli
		//System.out.println(list1.get(5));//Run time error
		
		//How to get index of an element
		System.out.println(list1.indexOf("Veli"));//2 (first occurrence)
		System.out.println(list1.indexOf("xxx"));
		//How to get index of last occurrence of an element
		System.out.println(list1.lastIndexOf("Veli"));//4 (last occurrence)
		System.out.println(list1.indexOf("xxx"));//-1
		
		//How to remove an element by using index
		//If you use remove() method with index it will return the element which is removed. 
		//For lists, using methods is enough to update. No need to make assignment
		//Because of that lists are called "mutable"
		System.out.println(list1.remove(1));//Angie  (so I can be sure)
		System.out.println(list1);//[Ali, Veli, Mary, Veli]
		
					//For Strings if you want to see updates on the String you have to make assignment.
					//Because of that Strings are called "immutable" (can not be changed)
					String s = "Java ooh Java";
					s.replace("a", "");
					System.out.println(s);//Java ooh Java (you have to assign to change)
					
		//How to remove a specific element by using the element (not with index)
		//If you use remove() with the element it will remove the first occurrence of the element
		System.out.println(list1.remove("Veli"));//true
		System.out.println(list1);//[Ali, Mary,Veli]
		System.out.println(list1.remove("xxx"));//false
		
		
		//Add some elements
		list1.add("Mary");
		list1.add("Mary");
		list1.add("Ali");
		list1.add("John");
		System.out.println(list1);
		
		
		//How to update an element with index
		list1.set(2, "Ahmet");//[Ali, Mary, Veli, Mary, Mary, Ali, John]
		System.out.println(list1);//[Ali, Mary, Ahmet, Mary, Mary, Ali, John]
		
		/*
		 * Create an integer list which has 5 elements
		 * Update all elements by adding "*" on the right of every element
		 */

		List <Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		List <String> list3 = new ArrayList<>();
		for (int i = 0; i < list2.size(); i++) {
			//System.out.println(list2.get(i).toString()+"*");
			list3.add(list2.get(i)+ "*");
		}

		System.out.println(list3);//[1*, 2*, 3*, 4*, 5*]
		
		//How to get a part of list
		System.out.println(list1.subList(2, 5)); //[Ahmet, Mary, Mary]
		
		
	   //How to add a list into another list 
		list1.addAll(list3);
		System.out.println(list1);//[Ali, Mary, Ahmet, Mary, Mary, Ali, John, 1*, 2*, 3*, 4*, 5*]
		//!!updated one is list1
		System.out.println(list3);//[1*, 2*, 3*, 4*, 5*]
		
		
		//How to add a list into another list as a specified index
		list1.addAll(3, list3);
		System.out.println(list1.addAll(list3));
		System.out.println(list1);//[Ali, Mary, Ahmet, 1*, 2*, 3*, 4*, 5*, Mary, Mary, Ali, John, 1*, 2*, 3*, 4*, 5*]
		
		
		list3.addAll(3, list1);
		System.out.println(list3);//[1*, 2*, 3*, Ali, Mary, Ahmet, 1*, 2*, 3*, 4*, 5*, Mary, Mary, Ali, John, 1*, 2*, 3*, 4*, 5*, 4*, 5*]
		
		//list3.removeAll(list1) method removes all elements of list1 from list3
		//!!!dr when it sees remove Ali it removes all Ali
		list3.removeAll(list1);
		System.out.println(list3);//[]
		
		//If you want to make a list empty use clear()
		//!!!we use it in loops like re set
		System.out.println(list2);//[1, 2, 3, 4, 5]
		list2.clear();
		//How to check if a list is empty list or not
		System.out.println(list2.isEmpty());//true
		System.out.println(list2);//[]
		
		//!!!new class
		//How to check if an element exists in the list
		//!!!ask
		System.out.println(list1.contains("Ali"));//true
		System.out.println(list1.contains("xxx"));//false
		
		/*
	 	Ask user to enter a letter
	 	If the letter exists in list1 convert it to "Got it"
	 	otherwise add the element which user entered into the list1
	*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a letter");
		
		String str = scan.next().toUpperCase().substring(0,1);
		
		if(list1.contains(str)) {		
			list1.set(list1.indexOf(str), "Got it");
			System.out.println(list1);		
		}else {			
			list1.add(str);
			System.out.println(list1);		
		}
		//!!! list3.add("X");
		list3.add("1*");
		list3.add("Ali");
		list3.add("John");
		System.out.println(list3);//[X, Ali, Jack]
		//önce false.. biri contain olmasý yetmez
		//If you want to check if multiple elements exist in a list
		System.out.println(list1.containsAll(list3)); //true
		scan.close();

	}

}
