import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class obedtortise {
	// We are going to make an obedient tortoise that will obey our commands to draw shapes. Please note that this is
	// not a recipe, but a list step-by-step instructions.

	// 1. Make a new class, create a main method, and show the tortoise.
	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.setSpeed(7);
		Tortoise.penDown();
		Tortoise.setPenColor(Color.GREEN);
		drawSquare();
	}

	// 2. Have the Tortoise draw a square.
	static void drawSquare() {
		for (int i = 0; i < 1; i++) {
			Tortoise.turn(90);
			Tortoise.move(50);
			Tortoise.turn(225);
			Tortoise.move(50);
			Tortoise.turn(225);
			Tortoise.move(50);
		}
	}
	// 3. Extract this code into a drawSquare() method.

	// 4. Have the Tortoise draw a triangle.

	// 5. Extract this code into a drawTriangle() method.

	// 6. Have the Tortoise draw a circle.

	// 7. Extract this code into a drawCircle() method.

	// 8. Ask the user which shape they want. Draw the appropriate shape depending on their answer.

	// 9. Ask the user which color they want. Color the the shape depending on their answer.

}
