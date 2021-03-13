package day03wrapperclassconcatenatelogicaloperators;

public class LogicalOperator01 {

	public static void main(String[] args) {
		/*
		 Operators in Java:
		 
		 1) = is assignment operator. 
		    Gets the value from right and puts it into a container.
		    For ex : int a = 45;
		     
		      Note= Followings are "Comparison Operator"
	    Comparison operators return boolean every time
		  
		 2) == is "equal sign" in Java
		    7 == 5+2 returns boolean
		    
		 3 ) != is "not equal"
		   it returns boolean
		   6 != 5
		   
		 4) > means greater than, returns boolean
		 
		 5) < means less than, returns boolean
		 
		 6) >= means greater than or equal to
		       returns boolean
		  
		 7) <= means less than or equal to
		       returns boolean
		   
	    Note: Followings are "Logical Operators"
	          Logical operators return boolean everytime    
		 8) && AND operator
		       returns true if everythimg is true
		       
		 9)|| OR operator 
		      returns false if everything is false
		      
		 10 )  & AND operator 
		       returns true if everything is true 
	    
		 */
		
		System.out.println(7 == 6+2);//false
		System.out.println(3 != 5-2);//false
		System.out.println(4>56);//false
		System.out.println(1 >= 11);//false
		System.out.println(6 <= 6);//true
		System.out.println((3<5) && (5>1));
		System.out.println((5<3) || (5>10) || (9<15) || (5==9));
		
		//What is the difference between && and & ? 
		System.out.println((5>8) & (5>1) & (0==0));
		
		System.out.println((5>8) && (5>1) && (0==0));

	}

}
