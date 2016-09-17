import javax.swing.JOptionPane;

public class countDown {
	public static void main(String[] args) {
		String num;
		String holder = "BLASTOFF";
		num = JOptionPane.showInputDialog("Enter a number");
		int num2 = Integer.parseInt(num);
		for (int i = 0; i < num2; num2--) {
			System.out.println(num2);
			if (num2 == 1) {
				System.out.println(holder);
				//speak(holder, null);
			}
			speak("", num2);
		}
		
		// 2. ask the user when to start (JOptionPane.showInputDialog)
		// 3. convert the user's answer to an int (Integer.parseInt)

		// 4. countdown from user's starting point
		// 1. countdown from 10 to 0

		// 5. when the counting is done, print "blastoff!"
	}

	static void speak(String words, int numbers) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
