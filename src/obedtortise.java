import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class obedtortise {
	// We are going to make an obedient tortoise that will obey our commands to draw shapes. Please note that this is
	// not a recipe, but a list step-by-step instructions.

	// 1. Make a new class, create a main method, and show the tortoise.
	public static void main(String[] args) {
		String shape = JOptionPane.showInputDialog("What shape?");
		Tortoise.show();
		Tortoise.setSpeed(10);
		Tortoise.penDown();
		Tortoise.setPenColor(Color.GREEN);
		if (shape.equals("square")) {
			drawSquare();
		}
		if (shape.equals("triangle")) {
			drawtriangle();
		}
		if (shape.equals("circle")) {
			drawcircle();
		}
	}

	// 2. Have the Tortoise draw a square.
	static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			Tortoise.turn(90);
			Tortoise.move(50);

		}
	}
	// 3. Extract this code into a drawSquare() method.

	// 4. Have the Tortoise draw a triangle.
	static void drawtriangle() {
		for (int i = 0; i < 3; i++) {
			Tortoise.move(50);
			Tortoise.turn(120);

		}
	}
	// 5. Extract this code into a drawTriangle() method.

	// 6. Have the Tortoise draw a circle.
	static void drawcircle() {
		for (int i = 0; i < 333333333; i++) {
			Tortoise.move(1);
			Tortoise.turn(1);
		}
	}
	// 7. Extract this code into a drawCircle() method.

	// 8. Ask the user which shape they want. Draw the appropriate shape depending on their answer.

	// 9. Ask the user which color they want. Color the the shape depending on their answer.

}
