import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
JFrame frame;
JPanel panel;
JButton button1,button2,button3,button4,button5,button6,button7;

public static void main(String[] args) {
SoundEffectsMachine sound = new SoundEffectsMachine();	
sound.showButtons();

}
 void showButtons() {
	frame = new JFrame();
panel = new JPanel();
button1 = new JButton("Laser");
button2 = new JButton("Dogs");
button3 = new JButton("Falling");
button4 = new JButton("Cow");
button5 = new JButton("Shatter");
button6 = new JButton("Fart");
button7 = new JButton("Fail");
frame.setTitle("Sound Effects");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(panel);
 panel.add(button1);
panel.add(button2);
 panel.add(button3);
panel.add(button4);
panel.add(button5);
panel.add(button6);
panel.add(button7);
button1.addActionListener(this);
button2.addActionListener(this);
 button3.addActionListener(this);
button4.addActionListener(this);
 button5.addActionListener(this);
button6.addActionListener(this);
button7.addActionListener(this);
frame.pack();
frame.setVisible(true);
System.out.println(button1);
 }
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button1) {
	playSound("hello.wav");
	}
	else if(e.getSource()==button2) {
	playSound("doggo.wav");
	}
	else if(e.getSource()==button3) {
		playSound("falling.wav");
	}
	else if(e.getSource()==button4) {
		playSound("cow.wav");
	}
	else if(e.getSource()==button5) {
		playSound("bottle.wav");
	}
	else if(e.getSource()==button6) {
		playSound("fart.wav");
	}
	else if(e.getSource()==button7) {
		playSound("fail.wav");
	}


}

private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
}








}
