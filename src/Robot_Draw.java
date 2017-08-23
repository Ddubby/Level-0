import org.jointheleague.graphical.robot.Robot;

public class Robot_Draw {
public static void main(String[] args) {
	

Robot dan=new Robot();
dan.setSpeed(10);
dan.penDown();
dan.move(185);
dan.turn(45);
for (int i = 0; i < 135; i++) {
dan.move(1);
dan.turn(1);
}
dan.move(100);
for (int i = 0; i < 135; i++) {
dan.move(1);	
dan.turn(1);
}
dan.turn(135);
dan.penUp();
dan.move(100);
dan.turn(-60);
dan.penDown();
dan.move(90);
dan.turn(120);
dan.move(90);
dan.turn(180);
dan.penUp();
dan.move(40);
dan.penDown();
dan.turn(-60);
dan.move(50);
dan.turn(-90);
dan.penUp();
dan.move(50);
dan.turn(-90);
dan.move(100);
dan.turn(-90);
dan.penDown();
dan.move(90);
dan.turn(180);
dan.move(30);
dan.turn(180);
for (int i = 0; i < 90; i++) {
dan.move(1);
dan.turn(2);
}
dan.move(80);
dan.turn(-90);
dan.move(150);
































}
}
