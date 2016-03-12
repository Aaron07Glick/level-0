import javax.swing.JOptionPane;

public class UNBDAY {
	public static void main(String[] args) {
		String today = "03/12";
		String deadpool = JOptionPane.showInputDialog("when is your bday");
		if (today.equals(deadpool)) {
			JOptionPane.showMessageDialog(null, "oh cool");
		} else {
			JOptionPane.showMessageDialog(null, "ok go away");
		}
	}
}
