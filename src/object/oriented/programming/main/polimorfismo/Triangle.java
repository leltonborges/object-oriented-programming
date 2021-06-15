package object.oriented.programming.main.polimorfismo;

public class Triangle extends Shape {

	//Polimorfismo dinâmico
	@Override
	void area(int width, int height) {
		System.out.println("Area: " + (width * height) / 2);
	}
}
