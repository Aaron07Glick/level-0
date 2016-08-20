import javax.swing.JOptionPane;

public class secretMessageBox {
	public static void main(String[] args) {
		String passWord = "sixSixSix";
		String input = JOptionPane.showInputDialog("What is the passcode?");
		// int userInput = Integer.parseInt(input);
		if (input.equalsIgnoreCase("sixSixSix")) {
			JOptionPane.showMessageDialog(null, "Satan has risen");
		} else {
			JOptionPane.showMessageDialog(null, "GO AWAY!");
		}

	}
}
