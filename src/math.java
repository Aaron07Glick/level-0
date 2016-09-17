import javax.swing.JOptionPane;

public class math {
	public static void main(String[] args) {
		String feet;
		int num;
		String inches;
		String userInputHeight;
		
		JOptionPane.showMessageDialog(null, "You must be taller then 2 inches to ride");
		userInputHeight = JOptionPane.showInputDialog("how tall are you in inches?");
		int userInputHeightNum = Integer.parseInt(userInputHeight);
		if (userInputHeightNum > 2) {
			JOptionPane.showMessageDialog(null, "you may pass");
		}
		else {
			JOptionPane.showMessageDialog(null, "you may not pass");
		}
		feet = JOptionPane.showInputDialog("enter feet");
		inches = JOptionPane.showInputDialog("enter Inches");
		int feetNum = Integer.parseInt(feet);
		int inchesNum = Integer.parseInt(inches);
		num = calculateInches(feetNum, inchesNum);
		JOptionPane.showMessageDialog(null, "you are "+ num + " inches");
		
	}
	public static int calculateInches(int feet, int inches){
		int height;
		height = (feet*12) + inches;
		return height;
	}
}
