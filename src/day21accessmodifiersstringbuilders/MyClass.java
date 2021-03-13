package day21accessmodifiersstringbuilders;

public class MyClass {
	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder();
		String s2=s1.toString();
		String s3=s1.toString();
		StringBuilder s4 = s1;
		System.out.println((s2==s3)+" "+(s1==s4));
		
		StringBuilder sb1=new StringBuilder("OCAJP8");
		StringBuilder sb2 = sb1;
		sb1.append("J");
		System.out.println(sb1 + " " + sb2 + " "+(sb1==sb2));
	
	}
}
