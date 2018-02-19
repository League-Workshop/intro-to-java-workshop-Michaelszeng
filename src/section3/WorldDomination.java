package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		for(int x=0;x<2;x=x+1) {
		// 1. Ask the user if they know how to write code.
		String answer = JOptionPane.showInputDialog("Do You know how to write code");
		// 2. If they say "yes", tell them they will rule the world.
		if (answer.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Good job you rule the world not really");
		}
		if(answer.equals("cat")) {
			JOptionPane.showMessageDialog(null, "you won good job");
		}
		// 3. Otherwise, wish them good luck washing dishes.
		else{
			JOptionPane.showMessageDialog(null, "Wow good job your dishes are very clean");
		}
		}
	}
}

