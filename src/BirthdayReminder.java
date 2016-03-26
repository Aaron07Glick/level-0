
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String deadpool = JOptionPane.showInputDialog("whose bday do you want to know");
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, "you choose " + deadpool);
		// 4. if user asked for "mom"
		if (deadpool.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, "" + momsBirthday);
		}
		// print mom's birthday
		// 5. if user asked for "dad"

		// print dad's birthday
		// 6. if user asked for your name
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}