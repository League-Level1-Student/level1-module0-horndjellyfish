import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
	public static void main(String[] args) {
		SoundEffects effect = new SoundEffects();
		effect.showButton();
	}

	private void showButton() {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton button1 = new JButton("Sawing wood");
		button1.setAlignmentX(250);
		panel.add(button1);
		frame.add(panel);
		button1.addActionListener(this);
		JButton button2 = new JButton("Punchline");
		button2.setAlignmentX(100);
		panel.add(button2);
		frame.add(panel);
		button2.addActionListener(this);
		JButton button3 = new JButton("Applause");
		button3.setAlignmentX(400);
		panel.add(button3);
		frame.add(panel);
		button3.addActionListener(this);
		frame.pack();
	}

	void soundSawingWood() {
		playSound("sawing-wood-daniel_simon.wav");
	}

	void soundPunchline() {
		playSound("punchline.wav");
	}

	void soundApplause() {
		playSound("applause.wav");
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().toString().contains("Sawing wood")) {
			soundSawingWood();
		}
		else if (e.getSource().toString().contains("Punchline")) {
			soundPunchline();
		}
		else if (e.getSource().toString().contains("Applause")) {
			soundApplause();
		}
	}

}
