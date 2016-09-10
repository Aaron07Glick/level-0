import javax.swing.JOptionPane;

public class knockKnockJoke {
	public static void main(String[] args) {
		String Holder;
		String numHolder;
		int numHolder2;
		Holder = JOptionPane.showInputDialog("do you want to hear a joke");
		if (Holder.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Fine then!");
				
			}
		else if (Holder.equalsIgnoreCase("yes")) {
			tellJoke();
			numHolder = JOptionPane.showInputDialog(null, "How annoying am I on a scale from one to ten?");
			numHolder2 = Integer.parseInt(numHolder);
			if (numHolder2<=10 && numHolder2>=1) {
				//System.out.println(10);
				for (int i = 0; i < numHolder2; i++) {
					tellJoke();
				}
			} 
			else if (numHolder2>10) {
				JOptionPane.showMessageDialog(null, "well arnt I annoying");
			}
		}
		else {
			JOptionPane.showConfirmDialog(null, "you dont deserve my joke");
		}
	}
	static void tellJoke(){
		JOptionPane.showMessageDialog(null, "Whats red and bad for your teeth...A BRICK HAHAHAHAHA");
	}
	}

