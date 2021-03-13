package day11whileloopdowhileloopp;

public class DoWhile01 {

	public static void main(String[] args) {
		//While loop: Condition is checked first then if it is true loop body runs.
		//If it is false it breaks. In while loop it is possible to make the loop body 
		//not to run
		int i =1;
		while(i>1) {
			System.out.println("This is while loop");
			i--;
		}
		//do-while loop: In the do while loop' loop body runs at least once. 
		//Because it checks the condition at the end. 
		do {
			System.out.println("This is do-while loop");
			i--;
		}while(i>1);
		
		

	}

}
