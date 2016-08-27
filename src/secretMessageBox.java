import javax.swing.JOptionPane;

public class secretMessageBox {
	public static void main(String[] args) {
		String passWord = "sixSixSix";
		String userName = "Satan";
		String input2 = JOptionPane.showInputDialog("Please enter a username");
		String input = JOptionPane.showInputDialog("What is the passcode?");
		// int userInput = Integer.parseInt(input);
		if (input2.equalsIgnoreCase("Satan") && input.equalsIgnoreCase("sixSixSix")) {
			JOptionPane.showMessageDialog(null, "I AM SATAN LORD OF DARKNESS");
		} else {
			JOptionPane.showMessageDialog(null, "GO AWAY!");
		}

	}
}
