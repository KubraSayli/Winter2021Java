package k_day03wrapperclassconcatenatelogicaloperators;

public class LogicalOperators01 {
	
	/*
	 Operators in JAVA:
	 1) = is assignment operator.
	    Gets the value from right and put is into a container
	    For example ; int x = 45; 
	    
	    Note= Followings are "Comparison Operator"
	    Comparison operators return boolean every time
	    
	 2) == is "equal sign" in JAVA
	    7 == 3+4 returns boolean
	    If left part equals to right part, it returns true, otherwise it returns false
	   
	 3) != means "not equal"
	   If left part is not equal to right part, it returns "true", otherwise it returns false
	
	 4) > means greater than
	    > returns boolean
	    
	 5) < means less than
	    < returns boolean
	    
	 6) >= means greater than or equal to 
	    >= returns boolean
	    
	 7) <= means less than or equal to
	    <= returns boolean
	    
	    Note: Followings are "Logical Operators"
	          Logical operators return boolean everytime
	  8) && AND operator
	     && returns true if everything is true
	     
	  9) || OR operator 
	     || returns false if everything is false
	     
	   10)& AND operator
	      & returns true if everything is true

	 */

	public static void main(String[] args) {
		
		System.out.println(9 == 4+5);//true
		
		System.out.println(3 != 6-2);//true
		
		System.out.println(4 > 20);//false
		
		System.out.println(1 >= 1);//true (it is enough to get true if one of them is true)
		
		System.out.println(5 <= 17);//true
		
		System.out.println(7 >= 9);//false
		
     	System.out.println((3<5) && (5>1) && (4==5));//false
		
		System.out.println((39<5) || (5>10) || (9<=15) || (5==9));//true
		
		//What is the difference between && and &?
		System.out.println((5>8) & (5>1)  & (0==0));
		System.out.println((5>8) && (5>1)  && (0==0));
		
	}

}
