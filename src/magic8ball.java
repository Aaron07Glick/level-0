
//Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class magic8ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		// 2. Make a variable that will hold a random number and put a random
		// number into this variable using "new Random().nextInt(4)"
		int deadpool = new Random().nextInt(4);
		// 3. Print out this variable
		System.out.println(deadpool);
		// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("enter a yes or no question");
		// 5. If the random number is 0
		if (deadpool == 0) {// -- tell the user "Yes"
			JOptionPane.showMessageDialog(null, "yes");
		}

		// 6. If the random number is 1
		if (deadpool == 1) {// -- tell the user "no"
			JOptionPane.showMessageDialog(null, "no");
		}
		// -- tell the user "No"

		// 7. If the random number is 2
		if (deadpool == 2) {// -- tell the user "maybe you should ask Google"
			JOptionPane.showMessageDialog(null, "maybe you should ask deadpool");
		}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
		if (deadpool == 3) {// -- tell the user ""
			JOptionPane.showMessageDialog(null, "ASKE A REAL PERSON AND GET A LIFE");
		}
		// -- write your own answer
	}

}