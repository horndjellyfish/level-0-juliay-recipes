
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {
	public static void main(String[] args) {
		// Ask the user how many hours they spent coding this week.
		String hoursString = JOptionPane.showInputDialog("How many hours have you spent coding this week?");
		// 1. If it's 3 or more, tell them they're a Code Ninja.
		int hours = Integer.parseInt(hoursString);
		if (hours >= 3)
			JOptionPane.showMessageDialog(null, "Wow! You're a Code Ninja!");
		else if (hours <= 2) {
			JOptionPane.showMessageDialog(null, "Stop watching YouTube and go write code instead!");
		} if (hours > 5) {
			playBatmanTheme();
		}
	}

	

	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
