 import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		
			
String rhink = JOptionPane.showInputDialog("Do you have a guess?");
			
			int socialtimeout = Integer.parseInt(rhink);
//			for (int i = 99; i > 0; i-=1) 
			for (int i = 0; i > 11; i+=1){
			
			if ( socialtimeout == random) {
			JOptionPane.showMessageDialog(null, "Yes! You win!");	
			}
			// 7. if the guess is high
			if (socialtimeout > random) {
			JOptionPane.showMessageDialog(null,"Aww... That's too high!");
			}	
			if (socialtimeout < random) {
			JOptionPane.showMessageDialog(null,"Nope! That's too low!");	
			}

		// 12. tell them they lose
	}

}
}


