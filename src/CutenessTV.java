import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
JFrame frame;
JPanel panel;
JButton button1,button2,button3;
public static void main(String[] args) {
	CutenessTV cute = new CutenessTV();
cute.showButtons();
}
void showButtons() {
frame = new JFrame();	
panel = new JPanel();
button1 = new JButton("Ducks"); 
button2 = new JButton("Frog");
button3 = new JButton("Unicorn");
frame.add(panel);
panel.add(button1);
panel.add(button2);
panel.add(button3);
button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
frame.pack();
frame.setVisible(true);
System.out.println(button1);
}
void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button1) {
		showDucks();
	}
	if(e.getSource()==button2) {
		showFrog();
	}
	if(e.getSource()==button3) {
		showFluffyUnicorns();
	}
}

}
