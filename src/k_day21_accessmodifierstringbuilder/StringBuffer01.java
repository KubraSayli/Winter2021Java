package k_day21_accessmodifierstringbuilder;

public class StringBuffer01 {
	public static void main(String[] args) {

		//String is immutable, because of that when you want to update a String
		//JVM needs to do many tasks like creating a new container, putting the updated value into it
		//then remove the previous String object
		String str = "Java";
		str.concat("X");
		
		//StringBuffer is created to update Strings easily  but Java made the StringBuffer
		//thread-safe and synchronized but that features made the StringBuffer slow. Then
		//Java created StringBuilder which is not thread-safe and not syncronized. 
		//So it worked faster than StringBuffer
		StringBuffer sbf = new StringBuffer("Java");
		sbf.insert(4, "X");
		System.out.println(sbf);//JavaX
		
		//As a result; if you are sure you will not need multi-threading just single threading
		//is enough for you use StringBuilder when you need to update a String. But if it is possible
		//you will use multithreading use StringBuffer
		StringBuilder sb = new StringBuilder("Java");
		sb.insert(4, "X");
		System.out.println(sb);//JavaX
	
	}
}
