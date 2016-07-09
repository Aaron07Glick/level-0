import javax.swing.JOptionPane;

public class Multyply {
	public static void main(String[] args) {
		//printMultpliction(9,9);
		String num;
		num = JOptionPane.showInputDialog("what table would you like to see");
		int num2 = Integer.parseInt(num);
		for (int i = 0 ; i < 13; i++) {
			printMultpliction(num2, i);
		}
	}
	static void printMultpliction(int a, int b){
		System.out.println(a + "x" + b + "=" + a*b);
		
	}
}
