import javax.swing.JOptionPane;

public class NASACountdown {
	public static void main(String[] args) {
		// 2. ask the user when to start (JOptionPane.showInputDialog)
		// 3. convert the user's answer to an int (Integer.parseInt)

		// 4. countdown from user's starting point
		// 1. countdown from 10 to 0

		String startingpoint = JOptionPane.showInputDialog("When do I start?");
		// 5. when the counting is done, print "blastoff!"
		int sp = Integer.parseInt(startingpoint);
		
		for (int i = sp; i > 0; i -= 1) {
		speak(Integer.toString(i));
		}
		speak("Blastoff!");
		
		JOptionPane.showMessageDialog(null, "Blastoff!");
	}			


	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
