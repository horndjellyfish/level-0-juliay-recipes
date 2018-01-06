import org.jointheleague.graphical.robot.Robot;

public class CircleRing {
	public static void main(String[] args) throws Exception {

		// 1. Make a new Robot
		Robot jack = new Robot();

		// 2. Set your robot’s position to x=150 and y=200
		jack.setX(150);
		jack.setY(200);
		// 3. Put the robot's pen down			
		jack.penDown();
		jack.setSpeed(100);
		// 4. Set the robot’s speed to 10
		jack.hide();
		// 5. Do everything below here 360 times (use i as the counter)
		int i;
		for (i = 0; i < 360; i += 1) {
			jack.move(3);
			jack.turn(1);
		}

		if (i % 20 <= 0) {
			for (int j = 0; j < 360; j += 1) {
				jack.move(1);
				jack.turn(1);
			}
		}
		// 6. Move the robot 3 pixels

		// 7. Turn the robot 1 degree

		// 8. If the counter i is divisible by 20 (hint: use mod operator %)

		// 9. Do steps 10 thru 12, 360 times (use j as the counter)

		// 10. Move the robot 1 pixel

		// 11. Turn the robot 1 degree
	}
}
