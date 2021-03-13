package k_day21_accessmodifierstringbuilder;

public class MyClassacc {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.capacity());
		sb1.append("StringBuilders ");
		sb1.append("are").append(" mutable");
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder(9);
		System.out.println(sb2.capacity());
		sb2.append("Java");
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		sb2.append(" is fun");
		System.out.println("Before trim: "+sb2.capacity());
		sb2.trimToSize();
		System.out.println("After trim: "+ sb2.capacity());
		System.out.println(sb2.length());
		
		StringBuilder sb3 = new StringBuilder("Zehra");
		//with append() you can add a part of any String at the end of your String
		sb3.append(" come home",0 , 5);
		System.out.println(sb3);
		sb2.append(sb3,5,10);
		System.out.println(sb2);
		
		System.out.println(sb3.charAt(4));
		sb3.deleteCharAt(8);
		System.out.println(sb3);
		sb3.delete(5, 9);
		System.out.println(sb3);
		
		StringBuilder sb4 = new StringBuilder("Ayse");
		StringBuilder sb5 = new StringBuilder("Ayse");
		
		System.out.println(sb4.toString().equals(sb5.toString()));
		System.out.println(sb3.equals(sb3));
		System.out.println(sb4.compareTo(sb5));//0 ==> StringBuilders have same characters
				//If you get "0" be sure StringBuilder values are same
		
		System.out.println(sb4.indexOf("y"));
		sb4.insert(0,"Can" );
		System.out.println(sb4);
		sb4.insert(3, "kimn", 1, 3);
		System.out.println(sb4);
		//to replace() a part of a String you can give indexes 
		sb4.replace(3, 6, "kk");
		System.out.println(sb4);
		
	//	sb4.reverse();
		System.out.println(sb4);
		
		sb4.setCharAt(3, 'n');
		System.out.println(sb4);
		
		System.out.println(sb4.subSequence(0, 6));
		System.out.println(sb4.substring(1));
		System.out.println(sb4);
		sb4.setLength(15);
		System.out.println(sb4);
		sb4.toString();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
