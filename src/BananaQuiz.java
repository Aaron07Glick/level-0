// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
	String banana;
	String hobby;
		//1. ask the user if they like bananas
		banana = JOptionPane.showInputDialog("do you like bananas");
		//2. if they say no, 
		if (banana.equals("no")) {
			JOptionPane.showMessageDialog(null, "you are crazy");
		}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		else if (banana.equals("yes")) {
			hobby = JOptionPane.showInputDialog("what is your favorite hobby");
			JOptionPane.showMessageDialog(null, hobby + " is much better with bananas");
		}
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
		
		//4. OPTIONAL: if they say something other than “yes” or “no”
		else {
			JOptionPane.showMessageDialog(null, "bananas");
		}
		//	show a pop up that says “You are bananas!”
	
	}

}
