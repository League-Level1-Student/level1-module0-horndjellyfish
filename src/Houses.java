import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot john = new Robot();
	public static void main(String[] args) {
		int small = 60;
		int medium = 100;
		int large = 250;
		john.setX(30);
		john.setY(550);
		john.miniaturize();
		john.setSpeed(15);
		john.setPenWidth(3);
		for (int i = 0; i < 9; i++) {
			drawHouse(large);
		}
		
		
		//String height = JOptionPane.showInputDialog("How tall do you want the first building; small, medium, or large?");
		
	}

	static void drawHouse(int height) {
			john.penDown();
			john.setRandomPenColor();
			john.move(height);
			john.turn(90);
			john.move(30);
			john.turn(90);
			john.move(height);
			john.turn(270);
			john.move(5);
			john.setPenColor(0, 200, 0);
			john.setPenWidth(5);
			john.move(20);
			john.setPenWidth(3);
			john.turn(270);

		}
	}
