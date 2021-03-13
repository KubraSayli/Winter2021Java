package day11whileloopdowhileloop;

public class DoWhile02Nt {
	public static void main(String[] args) {
		countChars();
	}
	
	/*
	 For the String "1234_?!abcdef", type a code to count the number of letters, 
	 the number of digits and the number of others by using do-while loop
	*/
	public static void countChars() {
		
		String str = "957_?!ab!c3d?e4<f";
		
		int idx = 0;
		int digitCounter = 0;
		int letterCounter = 0;
		int othersCounter = 0;
		
		do {	
			boolean isDigit = str.charAt(idx)>='0' && str.charAt(idx)<='9';
			if(isDigit) {
				digitCounter++;
			}
			
			boolean isLetter = (str.charAt(idx)>='a' && str.charAt(idx)<='z') || (str.charAt(idx)>='A' && str.charAt(idx)<='Z');
			if(isLetter) {
				letterCounter++;
			}
			
			boolean isOthers = !isDigit && !isLetter;
			if(isOthers) {
				othersCounter++;
			}
			
			idx++;
		}while(idx<str.length());
		
		System.out.println("The number of digits: " + digitCounter);
		System.out.println("The number of letters: " + letterCounter);
		System.out.println("The number of others: " + othersCounter);
		
	}

}
