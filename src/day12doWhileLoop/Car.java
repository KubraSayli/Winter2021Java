package day12doWhileLoop;

public class Car {

	/*
	 When you create a class, Java know you ll create objects
	 To create objects you need "constructor" because of that Java 
	 puts constructor behind the class
	 This constructor is default constructor
	 
	 */
	public String make; 
	public String model;
	public int price;
	public int year;
	public static void main(String[] args) {
		
		Car myCar1 = new Car();
	    System.out.println(myCar1.make);//null
	    //Make it Honda
	    System.out.println(myCar1.model);
        //Make it Accord
	    System.out.println(myCar1.price);
	    System.out.println(myCar1.year);
	    myCar1.move();
	    myCar1.stop();
	}
	
	//Is there a constructor ?
	public static void move() {
		System.out.println("Moves fast");
	}
	
	public static void stop() {
		System.out.println("Car stops");
	}

}
