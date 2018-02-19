package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/test/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	int hp = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
	int hd = 100;
		// 6.  Delete the slashes at the beginning of the next line.  
		while(hp>0 && hd>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String move = JOptionPane.showInputDialog("Would you like to kick or punch the dragon?");
		// 9. If they typed in "yell":
		
		if(move.equals("kick")) {
			int pa = new Random().nextInt(16);
			pa=pa+5;
			hd = hd-pa;
			JOptionPane.showMessageDialog(null, "You did:" +pa+ " damage. The dragons health is at:" +hd);
		}
		if(move.equals("punch")) {
			int pa = new Random().nextInt(23);
			hd = hd-pa;
			JOptionPane.showMessageDialog(null, "You did:" +pa+ " damage. The dragons health is at:" +hd);
		}
		int da = new Random().nextInt(26);
		hp = hp-da;
		JOptionPane.showMessageDialog(null, "It is the dragon's turn to attack! He does:" +da+ " damage, leaving you with" +hp+ " health.");
			//-- Find a random number between 0 and 10 and store it in dragonDamage
}
		if(hp<0) {
			JOptionPane.showMessageDialog(null, "Game Over! You Lose!");
		}
		if(hd<0) {
			JOptionPane.showMessageDialog(null, "Good job, you got lucky");
		}
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick":
		
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		
		// 12. Subtract this number from the player's health
		
		
		
		// 13. If the user's health is less than or equal to 0
		
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			
		}
	}

