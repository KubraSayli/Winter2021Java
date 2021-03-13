package day22stringbuildersencapsulation;

public class Encapsulation02 {
/*
 1)We use encapsulation to hide data and method implementations 
 
 2)Encapsulated codes should have following characteristics:
   a)Everyone should know how to access to encapsulated data 
   b)It should be easy to use even the code is complicated
 
 3)How to make encapsulation : 
   a)Make tha access modifier private
   b)Create "getter" and "setter"
     getters are used to read the data
     setters are used to update the data
     
 4)The advantages of encapsulation:
   a)It gives us flexibility, whenever we want we can just update the data with the help of setters
   b)Reusability we create getters and setters just once and use them again and again
   
 5)After creating private variables if you don't create any setter methods, it will be updated in the class. 
 Because of that the class is called immutable class
   
   If you want no one to read your data then don't create getter methods
   If you want no one to update your data then don't create setter methods
 */
	public static void main(String[] args) {
		Encapsulation01 obj = new Encapsulation01();
		System.out.println(obj.getAge());
		System.out.println(obj.getSsn());
		System.out.println(obj.getCollegeName().equals("Rutgers"));
		obj.setAge(67);
		System.out.println(obj.getAge());
	}

}
