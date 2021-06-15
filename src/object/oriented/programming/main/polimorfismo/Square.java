package object.oriented.programming.main.polimorfismo;

public class Square extends Shape{

	//Polimorfismo dinâmico
	@Override
	void area(int side) {
		System.out.println("Area: " + side * side);
	}
}
