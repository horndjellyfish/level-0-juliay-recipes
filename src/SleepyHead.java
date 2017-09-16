// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {
		
		boolean isWeekday, isVacation;
		
		/*
		 * Ask the user for these values using
		 * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int wkdy = (JOptionPane.showConfirmDialog(null, "Is it a weekday?", "", JOptionPane.YES_NO_OPTION));
		if (wkdy==1) {
			JOptionPane.showMessageDialog(null, "Sleep in!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Get up, lazybones!");
		}
		int wknd = (JOptionPane.showConfirmDialog(null, "Is it the weekend?", "", JOptionPane.YES_NO_OPTION));
		if (wknd==0) {
			JOptionPane.showMessageDialog(null, "Sleep in!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Get up, lazybones?");
		}
		int vaca = (JOptionPane.showConfirmDialog(null, "Is it a vacation?", "", JOptionPane.YES_NO_OPTION));
		if (vaca==0) {
			JOptionPane.showMessageDialog(null, "Sleep in!");
		}
		int vacawkdy = (JOptionPane.showConfirmDialog(null, "Is it a vacation on a weekday?"));
		if (vacawkdy==0) {
			JOptionPane.showMessageDialog(null, "Sleep in!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Get up, lazybones!");
		}
		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
	}
}

