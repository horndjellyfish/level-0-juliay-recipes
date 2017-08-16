
// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your
 * friend can read it. You set up the passcode and the secret message. Your
 * friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {
	public static void main(String[] args) {
		String passcode = "rhinkaf";
		String message = JOptionPane.showInputDialog("What is a secret message?");
		String input = JOptionPane.showInputDialog("What is the Passcode?");
		if (input.equals("rhinkaf")) {
			JOptionPane.showMessageDialog(null, message);
		} else {
			JOptionPane.showMessageDialog(null, "INTRUDER!!");
		}
	}

}