import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects {
	
	public static void main(String[] args) {
		SoundEffects se = new SoundEffects();
		se.playSound("sawing-wood-daniel_simon.wav");
	}
	
	private void showButton() {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton button1 = new JButton("TARDIS");
		
	}
	
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}

}
