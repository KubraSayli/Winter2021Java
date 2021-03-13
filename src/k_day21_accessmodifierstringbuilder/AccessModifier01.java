package k_day21_accessmodifierstringbuilder;

public class AccessModifier01 {
	private int privateAge = 30;
	protected String protectedString = "Protected String";
	String defaultString = "Default String";
	public String publicString = "Public String";
	
	public  void publicMethod() {
		System.out.println("This is public method");
	}
	
	protected void protectedMethod() {
		System.out.println("This is protected method, if we are in same package you can reach me\n"
				+ "if different packages, you need to be my child to reach me");
		
	}
	
	 void defaultMethod() {
		System.out.println("This is default method");
	}
	
	private void privateMethod() {
		System.out.println("This is private method");
	}
   
	
}
