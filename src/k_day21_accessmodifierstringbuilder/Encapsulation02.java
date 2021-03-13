package k_day21_accessmodifierstringbuilder;

public class Encapsulation02 {
public static void main(String[] args) {
		
		Encapsulation01s obj1 = new Encapsulation01s();
		
		System.out.println(obj1.getCollegeName());
		System.out.println(obj1.getSsn());
		System.out.println(obj1.getSsn().equals("1234"));
		obj1.setAge(78);
		System.out.println(obj1.getAge());


		//OOP Concept
		//özet
		
	}

}
