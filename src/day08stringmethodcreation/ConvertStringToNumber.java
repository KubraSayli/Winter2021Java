package day08stringmethodcreation;

public class ConvertStringToNumber {

	public static void main(String[] args) {
		// How do convert String to number ? 
		
		//Add these two numbers
		String s1 = "$12.99";
		String s2 = "$5.00";
		
		String str1 = s1.replace("$", "").replace(".","");
		String str2 = s2.replace("$", "").replace(".","");
				
	    System.out.println(str1);
	    System.out.println(str2);
	    
	    //parseInt() method converts Strings to integer if and only if the String is created just by numbers
	    System.out.println((Integer.parseInt(str1)+Integer.parseInt(str2))/100.0);
	    //valueOf() method converts Strings to integer if and only if the String is created just by numbers
	    System.out.println((Integer.valueOf(str1)+Integer.valueOf(str2))/100.0);
	    
	    String s4 = "$13.99";
	    String s5 = "$9.00";
	    
	    String str4 = s4.replace("$", "");
	    String str5 = s5.replace("$", "");
	    
	    System.out.println(Double.parseDouble(str4)+Double.parseDouble(str5));
	    System.out.println(Double.valueOf(str4)+Double.valueOf(str5));
	    
	    
	    
	    

	    
	}

}
