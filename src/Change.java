import javax.swing.JOptionPane;

public class Change {
	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels = JOptionPane.showInputDialog("Okay, fine, I'll help you. But first, you have to answer these questions. First one is: how many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int nicklesv = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog("All right, good. Next question: how many dimes do you have?");
int dimesv = Integer.parseInt(dimes);	
// Ask the user how many quarters they have, and convert their answer
String quarters = JOptionPane.showInputDialog("Okay, final question. How many quarters do you have?");
int quartersv = Integer.parseInt(quarters);		
// Calculate how much money the user has and save it in a double variable 

// Tell the user how much money they have

	}

}
