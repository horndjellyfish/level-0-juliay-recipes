import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie fortune = new FortuneCookie();
		fortune.showButton();
		
	}

	private void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(250, 250);
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton butt = new JButton();
		panel.add(butt);
		frame.add(panel);
		butt.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String fortune1 = "You will have an amazing day.";
		String fortune2 = "It will rain today.";
		String fortune3 = "Your teacher will be sick today.";
		String fortune4 = "Your hero will be honored today.";
		String fortune5 = "An enemy will bow down to you.";
		int rand = 1 + new Random().nextInt(4);
		String message = "woohoo";
		if (rand == 1) {
			message = fortune1;
		} else if (rand == 2) {
			message = fortune2;
		} else if (rand == 3) {
			message = fortune3;
		} else if (rand == 4) {
			message = fortune4;
		} else if (rand == 5) {
			message = fortune5;
		}
		JOptionPane.showMessageDialog(null, message);
		
	}
	
	
}
