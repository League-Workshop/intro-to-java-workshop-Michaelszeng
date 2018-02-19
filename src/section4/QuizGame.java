package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {
		// 1. Create a variable to hold the user's score
		int x = 0;
		// 2. Ask the user a question
		String lame = JOptionPane.showInputDialog("What is the square root of cat");
		// 3. Use an if statement to check if their answer is correct
		if (lame.equals("coconut tree")) {
			x = x + 1;
			JOptionPane.showMessageDialog(null, "Correct, Your score is:" + x);
		} else {
			x = x + 0;
			JOptionPane.showMessageDialog(null, "Wrong, Your score is:" + x);
		}

		// 4. if the user's answer is correct

		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String lam = JOptionPane.showInputDialog("What is 1+1");
		if (lam.equals("two")) {
			x = x + 0;
			JOptionPane.showMessageDialog(null, "Wrong, 1+1=window. Your score is:" + x);
		}
		if (lam.equals("window")) {
			x = x + 0;
			JOptionPane.showMessageDialog(null,
					"Wrong, 1+1=2. C'mon, this is easier than preschool math. Your score is:" + x);
		} else {
			x = x + 0;
			JOptionPane.showMessageDialog(null, "dude, you literally failed 1+1. Your score is:" +x);
		JOptionPane.showMessageDialog(null, "Congratulations, Your final score is:" +x);
		}
	}
	// 6. After all the questions have been asked, print the user's score
}
