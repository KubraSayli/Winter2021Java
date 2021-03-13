package k_day21_accessmodifierstringbuilder;

public class StringBuilder2p {
	public static void main(String[] args) {

		//String is immutable, because of that when you want to update a String
		//JVM needs to do many tasks like creating a new container, putting the updated value into it
		//then remove the previous String object
		String str = "Java";
		//!!!When you type çizzz heap str java
		str.concat("X");
		//!!!Java will create new container javax
		//!!!It will remove java 
		//!!!!just to update java does many things
		
		//StringBuffer is created to update Strings easily  but Java made the StringBuffer
		//thread-safe and synchronized but that features made the StringBuffer slow. Then
		//Java created StringBuilder which is not thread-safe and not syncronized. 
		//So it worked faster than StringBuffer
		StringBuffer sbf = new StringBuffer("Java");
		sbf.insert(4, "X");
		System.out.println(sbf);//JavaX
		//!!!çiz tek container java and javax
		//!!!there is no new container but
		//!!!java did buffer thread safe and synchronized
		//!!!if you give to much work it will be slow
		//!!but everything is not about synchronization 
		//!!!every time. we just want to update a string 
		//!!!That s why JAVA created String builder 
		//!!!if you don't need synchronization no need to use buffer
		//thread is task
		
		//As a result; if you are sure you will not need multi-threading just single threading
		//is enough for you use StringBuilder when you need to update a String. But if it is possible
		//you will use multithreading use StringBuffer
		StringBuilder sb = new StringBuilder("Java");
		sb.insert(4, "X");
		System.out.println(sb);//JavaX
	
	}

}
