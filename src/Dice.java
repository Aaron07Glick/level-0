import java.util.Random;

import javax.swing.JOptionPane;

public class Dice {
	public static void main(String[] args) {
		String question;
		question = JOptionPane.showInputDialog("how many sides does your dice have");
		int num = Integer.parseInt(question);
		int x = new Random().nextInt(num) + 1;
		JOptionPane.showMessageDialog(null, "your random number is " + x);

	}
}
