
// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
		double number;
		int QuarterMoney = GetQuarterAmount();
		int DimeMoney = GetDimeAmount();
		int NickalMoney = GetNickalAmount();
		number = QuarterMoney + DimeMoney + NickalMoney;
		JOptionPane.showInputDialog("You have " + number + " cents");
	}

	static int GetQuarterAmount() {
		String deadpool;
		deadpool = JOptionPane.showInputDialog("how many quarters do you have");
		int deadpoolquarter = Integer.parseInt(deadpool);
		return deadpoolquarter * 25;
	}

	static int GetDimeAmount() {
		String deadpool;
		deadpool = JOptionPane.showInputDialog("how many dimes do you have?");
		int deadpooldime = Integer.parseInt(deadpool);
		return deadpooldime * 10;
	}

	static int GetNickalAmount() {
		String deadpool;
		deadpool = JOptionPane.showInputDialog("how many nickals do you have?");
		int deadpoolnickal = Integer.parseInt(deadpool);
		return deadpoolnickal * 5;

	}
}
