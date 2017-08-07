import org.jointheleague.graphical.robot.Robot;

public class Robot_Square {
	public static void main(String[] args) throws Exception {
		// 1. Make a new Robot
Robot dan=new Robot();
		// 3. Put the robot's pen down
dan.penDown();
		// 6. Make the robot move as fast as possible
dan.setSpeed(10);
		// 5. Do everything below here 4 times
for (int i = 0; i < 4; i++) {
	

		// 		2. Move your robot 200 pixels
		dan.move(200);
// 		4. Turn the robot 90 degrees to the right (90 degrees)
dan.turn(90);
}
}

}
