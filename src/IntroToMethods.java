import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthSeparatorUI;

import org.omg.Messaging.SyncScopeHelper;

public class IntroToMethods {
	public static void main(String[] args) {
		new IntroToMethods().runMethods();

	}

	void runMethods() {
		weRock();
		rocker("billy the jack in the box employee");
		truth("jeffry the man from the burger king commercial");
		Echo("moooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo    ");
		repeat("lot");
		int sum = add(10, 20);
		System.out.println(sum);
num(10);
	}

	void weRock() {
		JOptionPane.showMessageDialog(null, "The League Rocks!");
	}

	void rocker(String rock) {
		JOptionPane.showMessageDialog(null, rock + " rocks!");
	}

	void truth(String truth) {
		if (truth.equalsIgnoreCase("jeffry the man from the burger king commercial")) {
			JOptionPane.showMessageDialog(null, truth + " " + "is awesome!");
		} else {
			JOptionPane.showMessageDialog(null, truth + " sucks!");
		}
	}

	void Echo(String fart) {
		JOptionPane.showMessageDialog(null, fart + fart);

	}

	void repeat(String repeat) {
		String ans = JOptionPane.showInputDialog("Enter a Whole Number");
		int num = Integer.parseInt(ans);
		for (int i = 0; i < num; i++) {
			System.out.println(repeat + " ");
		}
	}

int add(int num1, int num2 ) {
return num1 + num2;
}

 void num (int num) {

	 if(num%2==1)

	{
		System.out.println("It's odd!");
	}else
	{
		System.out.println("It's even");
	}
}}
