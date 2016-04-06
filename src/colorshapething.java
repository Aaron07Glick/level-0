// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;

public class colorshapething {
	public static void main(String[] args) {
String color;
Tortoise.setSpeed(10);
Tortoise.setAnimal(Animals.Turtle);
////color = JOptionPane.showInputDialog(null, "what color would you like the tortoise to draw in");
//if (color.equals("green")) {
//	Tortoise.setPenColor(Color.green);
//}
//else if (color.equals("blue")) {
//	Tortoise.setPenColor(Color.blue);
//}
//else if (color.equals("red")){
//	Tortoise.setPenColor(Color.red);
//}
////5. if the user doesn’t enter anything, choose a random color
//else  {
//	Tortoise.setPenColor(Color.black);
//}
for (int i = 0; i < 3; i++) {
	
	Tortoise.setPenColor(Colors.getRandomColor());
	
//3. ask the user what color they would like the tortoise to draw
		
		//4. use an if/else statement to set the pen color that the user requested

//5. if the user doesn’t enter anything, choose a random color

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
	
	//1. make the tortoise draw a shape (this will take more than one line of code)
	int side = 6;
	int length = 10;
for (int a = 0; a < side; a++) {
	
	Tortoise.move(length);
	Tortoise.turn(360/side);
	
}
	Tortoise.turn(60*4);
	Tortoise.penUp();
	Tortoise.move(length);
	Tortoise.turn(60*2);
	Tortoise.move(length);
	Tortoise.turn(60);
	Tortoise.penDown();
	
	
	
}
	}
}


