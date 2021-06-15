package object.oriented.programming.main.heranca;

public class CarTest {
	
	public static void main(String[] args) {
		// Herança
		Car c1 = new Civic();
		c1.on();
		c1.off();
		
		Car c2 = new Uno();
		c2.color = "Azul";
		c2.age = 2021;		
	}

}
