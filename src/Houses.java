import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot john = new Robot();

	public static void main(String[] args) {
		int small = 60;
		int medium = 100;
		int large = 200;
		john.setX(30);
		john.setY(550);
		john.miniaturize();
		john.setSpeed(50);
		john.setPenWidth(3);
		for (int i = 0; i < 5; i++) {
			drawPointyRoof(medium);
			drawPointyRoof(small);
			drawFlatRoof(large);
		}

	}

	static void drawFlatRoof(int height) {
		john.penDown();
		john.setRandomPenColor();
		john.move(height);
		john.turn(90);
		john.move(30);       
		john.turn(90);
		john.move(height);
		john.turn(-90);
		john.move(5);
		john.setPenColor(0, 150, 0);
		john.setPenWidth(5);
		john.move(20);
		john.setPenWidth(3);
		john.turn(-90);

	}

	static void drawPointyRoof(int height) {
		john.penDown();
		john.setRandomPenColor();
		john.move(height);
		john.turn(45);
		john.move(20);
		john.turn(90);
		john.move(20);
		john.turn(45);
		john.move(height);
		john.turn(-90);
		john.move(5);
		john.setPenColor(0, 150, 0);
		john.setPenWidth(5);
		john.move(20);
		john.setPenWidth(3);
		john.turn(-90);
	}
}
