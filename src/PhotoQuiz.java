/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		JPanel panel = new JPanel();
		quizWindow.add(panel);

                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
String turkey = "https://upload.wikimedia.org/wikipedia/commons/5/50/Gall-dindi.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component c;
		// 3. use the "createImage()" method below to initialize your Component
c = createImage(turkey);
		// 4. add the image to the quiz window
quizWindow.add(c);

		// 5. call the pack() method on the quiz window
quizWindow.pack();
quizWindow.setVisible(true);
// 6. ask a question that relates to the image
String a1 = JOptionPane.showInputDialog("What holiday do you eat a turkey?");
		// 7. print "CORRECT" if the user gave the right answer
if(a1.equalsIgnoreCase("thanksgiving")) {
	JOptionPane.showMessageDialog(null, "CORRECT!");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "INCORRECT");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(c);
		// 10. find another image and create it (might take more than one line of code)
String FLG = "http://www.stickpng.com/assets/images/5906074f0cbeef0acff9a640.png";
c = createImage(FLG);
		// 11. add the second image to the quiz window
quizWindow.add(c);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String a2=JOptionPane.showInputDialog("What fast food restraunt are these chicken nuggets from?");
		// 14+ check answer, say if correct or incorrect, etc.
if(a2.equalsIgnoreCase("kfc")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}
else {
	JOptionPane.showMessageDialog(null, "INCORRECT");
}
	
quizWindow.remove(c);	
	String coolGuy = "http://www.maxnormansites.com/images/about-img-2.jpg";
	c = createImage(coolGuy);
	quizWindow.add(c);
	quizWindow.pack();
	String a3 = JOptionPane.showInputDialog("Who is this cool guy? (First name and last name)");
	if(a3.equalsIgnoreCase("max norman")) {
		JOptionPane.showMessageDialog(null, "CORRECT");
	}
	else{
		JOptionPane.showMessageDialog(null, "INCORRECT, WHY DON'T YOU KNOW THE ANSWER?");
		quizWindow.remove(c);
		String arg = "https://vignette.wikia.nocookie.net/adventuretimewithfinnandjake/images/d/dc/Meme_face_mad.jpg/revision/latest?cb=20130323124352";
			c = createImage(arg);
			quizWindow.add(c);
			quizWindow.pack();
	JOptionPane.showMessageDialog(null, "Your Score: -1,345,762,839");
	}

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





