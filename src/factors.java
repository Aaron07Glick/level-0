import javax.swing.JOptionPane;

public class factors {
	public static void main(String[] args) {
		String number;
		number = JOptionPane.showInputDialog("enter a number");
		int numberz = Integer.parseInt(number);
		for (int i = 1; i < numberz + 1; i++) {
			factor(numberz,i );
		}
	}
	static void factor(int a, int b){
		if (a%b == 0) {
			System.out.println(b + " is a factor of " + a);
	
		}
	}
}
