import javax.swing.JOptionPane;

public class zombiemornoing {
	public static void main(String[] args) {
		String deadpool = JOptionPane.showInputDialog("do you need weekly or weekend schedule");
		if (deadpool.equals("weekly")) {
			sayweeklyschedule();
		}
if (deadpool.equals("weekend")) {
	sayweekendschedule();
}
		}
		
	static void sayweeklyschedule() {
		JOptionPane.showMessageDialog(null, "1. get up, 2. put on deadpool jacket. 3. go to school");
	}

	static void sayweekendschedule() {
		JOptionPane.showMessageDialog(null, "1.sleep all day then play video games all night");
	}
}