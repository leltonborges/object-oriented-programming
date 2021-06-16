package object.oriented.programming.main.enums;

public class Player {

	int life = 100;
	int x;
	int y;

	boolean attack(Player otherPlayer) {
		int deltaX = Math.abs(x - otherPlayer.x);
		int deltaY = Math.abs(y - otherPlayer.y);

		if (deltaX == 0 && deltaY == 1) {
			otherPlayer.life -= 10;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			otherPlayer.life -= 10;
			return true;
		}else {
			return false;
		}

	}

	boolean walk(Direction direction) {
		switch (direction) {
		case NORTH:
			y--;
			break;
		case EAST:
			x++;
			break;
		case SOUTH:
			y++;
			break;
		case WEST:
			x--;
			break;
		}
		return true;
	}
}
