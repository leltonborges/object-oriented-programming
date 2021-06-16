package object.oriented.programming.main.enums;

public class Game {

	public static void main(String[] args) {
		Player hero = new Hero();
		hero.x = 10;
		hero.y = 10;

		Player monster = new Monster();
		monster.x = 10;
		monster.y = 11;

		System.out.println("Hero: " + hero.life);
		System.out.println("Monster: " + monster.life);

		hero.attack(monster);
		monster.attack(hero);

		System.out.println("Hero: " + hero.life);
		System.out.println("Monster: " + monster.life);
	}
}
