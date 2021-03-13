package day12doWhileLoop;

public class Animal {
	/*
	 When you create a class, Java know you ll create objects
	 To create objects you need "constructor" because of that Java 
	 puts constructor behind the class
	 This constructor is default constructor
	 
	 */
	public int age;
	public String name = "cat";
	public int weight;
	
	public static void main(String[] args) {
	 
		Animal obj = new Animal();
		
		System.out.println(obj.age);
		//make it 10
		System.out.println(obj.name);
		//make it cat
		System.out.println(obj.weight);

		obj.sound();
		obj.eat();
	}
	//Is there a constructor ?
		public static void eat() {
			System.out.println("Animals eat");
		}
		
		public static void sound() {
			System.out.println("Animals make sound");
		}
    
}
