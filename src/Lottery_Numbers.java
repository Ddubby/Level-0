import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_Numbers {
	public static void main(String[] args) {
		Random Rand = new Random();
		for (int i = 0; i < 6; i++) {

			int Numbers = Rand.nextInt(9);

			System.out.print(Numbers);

		}

		// Next One (Extras)
		Random Hi = new Random();
		int Items = Hi.nextInt(3);
		String answer = JOptionPane.showInputDialog("Name 3 items, one at a time");
		String answer2 = JOptionPane.showInputDialog("Second one");
		String answer3 = JOptionPane.showInputDialog("Last one");
		if (Items == 0) {

			JOptionPane.showMessageDialog(null, "Can you guess what we chose? We chose " + answer);
		}
		if (Items == 1) {

			JOptionPane.showMessageDialog(null, "Can you guess what we chose? We chose " + answer2);
		}
		if (Items == 2) {

			JOptionPane.showMessageDialog(null, "Can you guess what we chose? We chose " + answer3);
		}
		// Next One
		Random bye = new Random();
		int item = bye.nextInt(10);
		String a;
		String chose="";
		for (int i = 0; i < 9; i++) {

			 a = JOptionPane.showInputDialog("Name items");
			if (item == i) {
				 chose = a;
			}

		}
JOptionPane.showMessageDialog(null, "We chose "+chose);
	}
}