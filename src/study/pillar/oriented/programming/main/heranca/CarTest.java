package study.pillar.oriented.programming.main.heranca;

public class CarTest {
	
	public static void main(String[] args) {
		// Herança
		Car c1 = new Civic();
		c1.SpeedUp();
		System.out.println(c1.speed);
		System.out.println(c1.maxSpeed);
		c1.on();
		
		c1.SpeedUp();
		System.out.println(c1.speed);
		c1.turboOn();
		c1.SpeedUp();
		System.out.println(c1.speed);
		c1.off();
		
		Car c2 = new Uno();
		c2.color = "Azul";
		c2.age = 2021;		
	}

}
