import javax.swing.JOptionPane;

public class UniverseThingy {
	public static void main(String[] args) {
		String save;
		save = JOptionPane.showInputDialog("Do you know how to code");
		if (save.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "You are going to dominant the universe");
		}
		else if (save.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Go learn it!");
		} 
		else {
			JOptionPane.showMessageDialog(null, "ill take that that as a no");
		}
	}
}
