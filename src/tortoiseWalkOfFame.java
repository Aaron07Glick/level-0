import org.teachingextensions.logo.Tortoise;

public class tortoiseWalkOfFame {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		Tortoise.show();
		Tortoise.penUp();
		Tortoise.setX(200);
		Tortoise.setY(200);
		for (int i = 0; i < 12; i++) {
			tortoiseWalk();
			Tortoise.penUp();
			Tortoise.move(50);
			Tortoise.penDown();
		}
		Tortoise.hide();
	}

	public static void tortoiseWalk() {
		Tortoise.show();
		Tortoise.turn(30);
		Tortoise.penDown();
		for (int i = 0; i < 5; i++) {
			Tortoise.move(30);
			Tortoise.turn(144);
		}
	}
}
