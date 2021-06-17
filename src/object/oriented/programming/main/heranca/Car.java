package object.oriented.programming.main.heranca;

public class Car {

	String color;
	boolean onOrOff;
	int age;
	int speed;
	int accelerate;
	int slowDown;
	int maxSpeed;

	public Car(String color, boolean onOrOff, int age, int speed, int accelerate, int slowDown, int maxSpeed) {
		this.color = color;
		this.onOrOff = onOrOff;
		this.age = age;
		this.speed = speed;
		this.accelerate = accelerate;
		this.slowDown = slowDown;
		this.maxSpeed = maxSpeed;
	}

	public void on() {
		this.onOrOff = true;
	}

	public void off() {
		this.onOrOff = false;
	}

	public void SpeedUp() {
		if (!onOrOff)
			return;
		
		if (accelerate + speed > maxSpeed) {
			speed = maxSpeed;
		} else {
			speed = accelerate + speed;
		}
	}

	public void slowDown() {
		if (!onOrOff)
			return;
		
		if (speed - slowDown < 5) {
			speed = 5;
		} else {
			speed = speed - slowDown;
		}

	}
	
	public  void turboOn() {
		// default
	}
}

