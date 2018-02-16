package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot rob=new Robot();
		rob.miniaturize();
		rob.setSpeed(100);
		rob.penDown();
		rob.setPenWidth(10);
		int y=0;
		for(int i=0;i<360;i=i+1) {
		rob.setRandomPenColor();
		rob.move(200);
		rob.turn(173+y);
		y=y-3;
		}
		
	}
}
