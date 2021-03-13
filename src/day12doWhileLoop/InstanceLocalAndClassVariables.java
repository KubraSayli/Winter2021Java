package day12doWhileLoop;

public class InstanceLocalAndClassVariables {
	/*
	 =====Instance (Object) Variables=====
	 ->We create instance variable inside the class but outside of the methods
	 ->Instance variables are 'not static' !!! d
	 -> If you don't initialize(assigning value) an instance variable, 
	    Java will assign them default values.
	 ->!!!!To access instance variables you need to create an object
	 
	           Default Values:
	    	For byte, short, int, long, default value is 0
	 		For char, default value is ' '.
	 		For boolean default value is "false"
	 		For float and double default value is 0.0
	 		For String, default value is null
	 		
	=====Class Variables========
	->We create class variable inside the class but outside of the methods
	->Class variables are 'static' !!!!create static short s
	->You can assess static variables by using class name
	  
	  Note: The main differences between static (class) variables and instance(object) 
	  variables is that 
	 			a)All updates on a static variable is visible by all objects which are 
	 			created from class but all updates on an "intance variable" is visible 
	 			just by the object
	            b)"static variables" are common for all objects , but instance variables 
	            are specified for an object
	            
	    =====Local Variables====
	    If you create a variable inside a method it is called "local variable".
	 	a)Do not forget to initialize local variables.If you try to use local variables before initializing Java complains.        
	      There is no default value for local variables
	
	  Note: Local variables which are created in a static method are static automatically
	 */
	
	int num1 = 5;//Instance variable 
	int num2;    //Instance variable (no need to assign, it will assigned by default )
    String str;  //Instance variable (no need to assign, it will assigned by default )
	double d;    //Instance variable (no need to assign, it will assigned by default )
	boolean b;   //Instance variable (no need to assign, it will assigned by default )
	char c;
	
	static short s ; //Class variable
						//!!! attached to the class
	public static void main(String[] args) {
	//System.out.println(str);
    //System.out.println(d);
	//	System.out.println(b);
	//	System.out.println(c);
		System.out.println(InstanceLocalAndClassVariables.s);
		long l1 = 14;
		l1++;
		
		//String str;
		//System.out.println(str);
		
		//int m ;
		//m++;
}
	
	//!!!!l1++; We can not use them outsite the method scope!
// static int m;
public static void add(int a, int b ) {
	System.out.println(a+b);
}


}
