package object.oriented.programming.main.polimorfismo;

public class Shape {
	String color;
	
	void area() {
		System.out.println("default");
	}
	
	//Polimorfismo estático
	void area(int side) {
		System.out.println("default");
	}
	
	//Polimorfismo estático
	void area(int width, int height) {
		System.out.println("default");		
	}
}
