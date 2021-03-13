package day08stringmethodcreation;

public class StringMethods01 {

	public static void main(String[] args) {
		String str1 = "yasemin ozkafa";
		
		System.out.println(str1.substring(4));//min ozkafa
		//first index is inclusive, second index is exclusive
		System.out.println(str1.substring(3, 6));//emi
		System.out.println(str1.substring(5, 5));//nothing
		//System.out.println(str1.substring(7,5));
		
		//19)trim()
		//trim() is used for remove space character JUST from the beginning and from end of the String
		String str2 = "  Java is Java ";
		System.out.println(str2.length());//15
		System.out.println(str2.trim().length());//12
		
		//By using String methods change the String "  Ayse123 kaya/%   "  to Ayse KAYA
		String str3 = "  Ayse123 kaya/%   ";
		
		//1st way
		System.out.println(str3.replaceAll("\\W", "").replace("kaya", "KAYA").replace("123"," "));
		
		//2nd way
		String firstname = str3.substring(2, 6);
		String surname = str3.substring(10, 14).toUpperCase();
		System.out.println(str3.substring(2, 6));
		System.out.println(str3.substring(10, 14));
		System.out.println(firstname + " " + surname);
		
		//20)concat() is used for joining Strings 
		System.out.println(firstname.concat(" ").concat(surname));
		
		

	}

}
