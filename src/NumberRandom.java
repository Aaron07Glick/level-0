import java.util.Random;

import javax.swing.JOptionPane;

public class NumberRandom {
	public static void main(String[] args) {
		String userinput;
		int counter = 0;
		int x = new Random().nextInt(50) + 1;
		int y = new Random().nextInt(50) + 1;
		userinput = JOptionPane.showInputDialog("enter a number from 1 to 50");
		int num = Integer.parseInt(userinput);
		if (num >= 51) {
			JOptionPane.showMessageDialog(null, "That is not a number you can enter");
		}
		for (counter = 0; x != num; counter++) {
			x = new Random().nextInt(50) + 1;
		}
		System.out.println(counter);
		for (counter = 0; x != y; counter++) {
			y = new Random().nextInt(50) + 1;
			x = new Random().nextInt(50) + 1;
		}
		System.out.println(counter);
	}

}
