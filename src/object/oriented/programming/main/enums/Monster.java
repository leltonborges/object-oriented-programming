package object.oriented.programming.main.enums;

public class Monster extends Player{
	
	public Monster() {
		super(0, 0);
	}

	@Override
	boolean attack(Player otherPlayer) {
		boolean at1 = super.attack(otherPlayer);
		boolean at2 = super.attack(otherPlayer);
		
		return at1 || at2;
	}
}
