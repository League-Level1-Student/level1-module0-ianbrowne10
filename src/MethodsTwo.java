import java.util.Random;

import javax.swing.JOptionPane;

public class MethodsTwo {
	public static void main(String[] args) {
		new MethodsTwo().runMethods();

	}

	void runMethods() {
		whichPresent("Tate");
		doPigsEat("roots");
JOptionPane.showMessageDialog(null, getMyLuckyNumber());

	}
	/// public MethodsTwo() {

	// TODO Auto-generated constructor stub
	// }

	void whichPresent(String friendName) {
		if (friendName.equalsIgnoreCase("Tate")) {
			JOptionPane.showMessageDialog(null, "You must want diapers!");
		}
	}

	void doPigsEat(String food) {
		if (food.equalsIgnoreCase("roots")) {
JOptionPane.showMessageDialog(null, "That is correct!");
		}
		else {
			JOptionPane.showMessageDialog(null, "That is wrong!");
		}
	}
int getMyLuckyNumber() {
Random rand = new Random();
return rand.nextInt();

}
}
