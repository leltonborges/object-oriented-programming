package object.oriented.programming.main.heranca;

import object.oriented.programming.main.heranca.interfaces.Sport;

public class Civic extends Car implements Sport{

	public Civic() {
		super("Prata", false, 2018, 0, 15, 13, 260);
	}
	
	@Override
	public void turboOn() {
		speed = 35;
	}

	@Override
	public void turboOffe() {
		speed = 15;
	}
}
