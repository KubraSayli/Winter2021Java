package k_day21_accessmodifierstringbuilder;

public class AccessModifier02 {

	
	 /*
	  *    To access a class member in another class you have 2 ways;
	 		a)You can use "class name" ==> Use that way for "static class members"
	 		b)You can use object of the class ==> Use that way for "non-static class members"
		 1) In AcMo01, I created private, protected, default and public instance variables.
		    In AcMo02, I created an object to access them but I could not access to the private one.
		    So private class members cannot be accessed from other classes.
		    
		 2) From different packages you cannot access to default class members
		    For example; if you create a variable in package A, you can access to the variable from all classes
		    in the package A  but you cannot access to the variable from other packages.
		    "default" and "package private" are synonyms
		    
		 3) From different packages, you have 2 option for "protected" ones.
		    If you are in "Child" class, you can access to the protected ones.
		    If you are not in a "Child" class, you cannot access the protected ones.
		    
		 4) Public class members can be accessed from everywhere. There is no any restriction for 
		    public class members.
		    
		 Note: For classes, "private" and "protected" access modifiers cannot be used.
		 	   You can use just "public" or "default" access modifiers.
		 */
	 
	public static void main(String[] args) {
		AccessModifier01 obj = new AccessModifier01();
		System.out.println(obj.defaultString);
		System.out.println(obj.protectedString);
		System.out.println(obj.publicString);
		obj.defaultMethod();
		obj.publicMethod();
		obj.protectedMethod();
	}
	
	
	
	
	
}
