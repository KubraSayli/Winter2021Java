package k_day14constructorstatickeywordarrays;

public class Animal2 {
	public String name = "Joe";
	public int weight = 78;
	public boolean herbivorous = false;
	
	public Animal2() {
		
	}
	public Animal2(String name) {
		this.name = name;
	}
	public Animal2(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	public Animal2(String name, int weight, boolean herbivorous) {
		this.name = name;
		this.weight = weight;
		this.herbivorous = herbivorous;
	}
	
	public static void main(String[] args) {
	
	}

}
