package object.oriented.programming.main.polimorfismo;

public class ShapeTest {
	
	public static void main(String[] args) {
		Shape s1 = new Square();
		s1.color = "Red";
		s1.area(3); // area do Square side * side = 9
		s1.area(); // default
		
		Shape s2 = new Triangle();
		s2.area(3); // default
		s2.area(4, 3); // 6
	}
}
 