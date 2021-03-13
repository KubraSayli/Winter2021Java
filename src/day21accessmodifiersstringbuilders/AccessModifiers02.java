package day21accessmodifiersstringbuilders;

public class AccessModifiers02 {
/*
 To access class members from another class we have two ways:
 a)We can use class name => it works only for static members
 b)We can create object => it works for non-static members
 
1)In AccessModifiers01 class we created public, protected, default, private variables
  In AccessModifiers02 we created an object to access them but we could not access to
  private ones.
  
2)From different packages you cannot access default members
  That's why "default" and "package private" are synonyms.
  
3)From different packages we have two option to access protected members
  If we are in child class (sub-class) we can access them
  If we are in not a child class we can not access them
  
4)For public class members we can access them from everywhere 

Note:For classes, "private" and "protected" access modifiers cannot be used
 */
	
	public static void main(String[] args) {
		
		AccessModifiers01 obj = new AccessModifiers01();
		System.out.println(obj.defaultString);
		System.out.println(obj.protectedString);
		System.out.println(obj.publicString);
		
		obj.defaultMethod();
		obj.protectedMethod();
		obj.publicMethod();

	}

}
