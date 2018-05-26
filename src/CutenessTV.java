import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	public static void main(String [] args) {
		CutenessTV cute = new CutenessTV();
		cute.showButton();		
	}
	private void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton button1 = new JButton("Ducks");
		panel.add(button1);
		frame.add(panel);
		button1.addActionListener(this);
		JButton button2 = new JButton("Frog");
		panel.add(button2);
		frame.add(panel);
		button2.addActionListener(this);
		JButton button3 = new JButton("Fluffy Unicorn");
		panel.add(button3);
		frame.add(panel);
		button3.addActionListener(this);
	}
//	void showDucks() {
//	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
//	}
//
//	void showFrog() {
//	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
//	}
//
//	void showFluffyUnicorns() {
//	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
//	}
//
//	void playVideo(String videoID) {
//	     try {
//	          URI uri = new URI(videoID);
//	          java.awt.Desktop.getDesktop().browse(uri);
//	     } catch (Exception e) {
//	          e.printStackTrace();
//	     }
//	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
