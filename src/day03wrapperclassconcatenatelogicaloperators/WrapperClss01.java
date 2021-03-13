package day03wrapperclassconcatenatelogicaloperators;

public class WrapperClss01 {
	
	/*
	 Wrapper class : Java created some objects whose values 
	 are coming from primitive data types but the objects have smethods as well.
	 
	  
	Wrapper for boolean ==> Boolean
	!!!!Wrapper for char ==> Character
	Wrapper for byte ==> Byte
	Wrapper for short ==> Short
	!!!!!Wrapper for int ==> Integer
	Wrapper for long ==> Long
	Wrapper for float ==> Float
	Wrapper for double ==> Double
	 */

	public static void main(String[] args) {
		
	Integer i = 12; 
	
	//Find the min and maximum value of byte data type: 
	Byte minByteValue = Byte.MIN_VALUE;
	System.out.println(minByteValue);
	
	Byte maxByteValue = Byte.MAX_VALUE;
	System.out.println(maxByteValue);
	
	//Find the min and maximum value of long data type: 
	Long longmax = Long.MAX_VALUE;
	System.out.println(longmax);//9223372036854775807
	
	Long longmin = Long.MIN_VALUE;
	System.out.println(longmin);//-9223372036854775808
		
	//Find all min and max values of primitive data types	
	
	System.out.println((int)Character.MIN_VALUE+(int)Character.MAX_VALUE);
		
		
	
		
		
		
		
		
		
		
		
		
		

	}

}
