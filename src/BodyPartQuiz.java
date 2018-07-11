/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// 0. You can use the celebrity photos we have placed in the default java package,  
	// or if you prefer, get celebrity photos from the Internet, place them in the default
	// package, and change the names below.
	
	String firstImage = "src/arnold.jpeg";
	String secondImage = "src/leonardo.jpeg";
	String thirdImage = "src/morgan.jpeg";
	String fourthImage = "src/jack.jpeg";
	
	JFrame window = new JFrame();
	JPanel panel = new JPanel();


	private void startQuiz() {

		// 1. Make an int variable to hold the score.
int score = 0; 
		// 2. Set the size of the window in the initializeGui() method below
initializeGui();
		for (int i = 0; i < 4; i++) {

			// 4. Ask the user who this person is and store their answer
			String guess= JOptionPane.showInputDialog("Who is this? (First name only)");
			
			// 5. Check their answer. If they guessed correctly:
			// -- Tell them they are right and increase the score by 1
if(i==0&&guess.equalsIgnoreCase("arnold")) {
	System.out.println("Correct!");
score +=1;
}
else if (i==1&&guess.equalsIgnoreCase("leonardo")) {
	System.out.println("Correct!");
score +=1;
}	
else if(i==2&&guess.equalsIgnoreCase("morgan")) {
	System.out.println("Correct!");
score +=1;
}
else if(i==3&&guess.equalsIgnoreCase("jack")) {
	System.out.println("Correct!");
score +=1;
}
// 6. Otherwise:
			// -- Tell them they are wrong and who the person is
else {
	System.out.println("Incorrect!");
score -=1;
}
			// 7. Use the showNextImage() method below to get the next image
			showNextImage();
		    // 8. Show them their current score
			JOptionPane.showMessageDialog(null, "Your score is " +score+"!");
			// 9. .... repeat for all your images.....


		}

	}

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());		
		window.setVisible(true);
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		
		// 3. Change the size of the window so that you can only see part of the image.		
		Random rand = new Random();
		int RandomNumber = new Random().nextInt(5);
		System.out.println(RandomNumber);
		if(RandomNumber==1) {
		window.setSize(500,500);
		}
		if(RandomNumber==2) {
			window.setSize(300,68);
			}
		if(RandomNumber==3) {
			window.setSize(205,70);
			}
		if(RandomNumber==4) {
			window.setSize(45,123);
			}
		showNextImage();
		
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		System.exit(0);
		return new JLabel();
	}
}
