import org.jointheleague.graphical.robot.Robot;
public class robotgraffiti {
public static void main(String[] args) {
	Robot bender = new Robot();
	bender.setSpeed(10);
	bender.penDown();
	bender.turn(25);
	bender.move(200);
	bender.turn(180-25);
	bender.move(200);
	bender.turn(180);
	bender.move(100);
	bender.turn(-60);
	bender.move(90);
	bender.penUp();
	bender.move(666);
	bender.turn(180);
}
}
