import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;


/*** Teacher's note ***/
 /* Before beginning recipe: 
 * 1. ask students to find and explain the variables in this recipe. 
 * 2. ask students what robot commands they think they will use to make picture in the laminated hand-outs: http://bit.ly/ninja-star */

public class FlamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms

		// 1. Make a new robot, and set its pen down.
		Robot rhink = new Robot();
		rhink.penDown();
		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 12. Set the robot speed to 10
		rhink.setSpeed(10);
		// 13. Make all the code below repeat 25 times

		
			rhink.turn(45);			
			rhink.move(64);			
			rhink.turn(-40);			
			rhink.setPenColor(500, 50, 0);
			rhink.move(flameSize);			
			rhink.turn(170);			
			rhink.move(flameSize);		
			rhink.turn(64);
			rhink.setPenColor(0, 0, 0);
			rhink.move(baseSize);
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			// 11. Color your ninja star like Figure 2.
		
	}

}





