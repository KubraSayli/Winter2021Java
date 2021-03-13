package k_day14constructorstatickeywordarrays;

public class Animal {
	
	public String name = "Joe";
	public int weight = 78;
	public static boolean isHerbivorous = false;
	

	public static void main(String[] args) {
	
	}
	
	public static void eat() {
		if(isHerbivorous) {
			System.out.println("Eats plants");
		}else {
			System.out.println("Eats both plants and meat");
		}
	}
	
	public static void drink() {
		System.out.println("Drinks water");
	}
	
	public static void move() {
		System.out.println("Moves");
	}
}