import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
JFrame frame;
JPanel panel;
JButton button;
public static void main(String[] args) {
FortuneCookie cook = new FortuneCookie();	
	cook.showButtons();
}
void showButtons() {
	 frame = new JFrame();
 panel = new JPanel();
 button = new JButton("Fortune Cookie");
frame.add(panel);
panel.add(button);
button.addActionListener(this);
frame.pack();
frame.setVisible(true);
System.out.println(button);
}
	
	   




@Override
public void actionPerformed(ActionEvent e) {
	System.out.println(button);
	// TODO Auto-generated method stub
	if(e.getSource()==button){
		int r = new Random().nextInt(6);
	if(r==1) {
		JOptionPane.showMessageDialog(null, "You Will Eat A Fortune Cookie Today!");
	}
	if(r==2) {
		JOptionPane.showMessageDialog(null, "You Will Have An Encounter with a Rhino While Walking Your Dog!");
	}
	if(r==3) {
		JOptionPane.showMessageDialog(null, "In The Next 5 Minutes, You Will Breath!");
	}
	if(r==4) {
		JOptionPane.showMessageDialog(null, "You Will Slip On A Bar Of Soap And Break Your Leg!");
	}
	if(r==5) {
		JOptionPane.showMessageDialog(null, "You Will Read A Message From a Piece Of Paper That You Found In A Cookie!");
	}
	}
}
}