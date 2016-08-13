import org.teachingextensions.logo.Tortoise;

public class tortoiseWalkOfFame {
	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.penUp();
		Tortoise.setX(10);
		Tortoise.setY(300);
		Tortoise.show();
		Tortoise.turn(45);
		Tortoise.penDown();
		for (int i = 0; i < 5; i++) {
			Tortoise.move(100);
			Tortoise.turn(144);
		}

	}
}
