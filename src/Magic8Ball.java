// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	
	public static void main(String[] args) {
	
	
	
	int first = new Random().nextInt(4);
	
	System.out.println(first);
	
	JOptionPane.showInputDialog("Ask me your questions.");
	
	if (first == 0) {
	JOptionPane.showMessageDialog(null, "Yes.");
	}
	

	
	if (first == 1) {
	JOptionPane.showMessageDialog(null,"No.");
	}
	
	if (first == 2) {
	JOptionPane.showMessageDialog(null,"Maybe you should ask Google?");	
	}
	
	
	if (first == 3) {
	JOptionPane.showMessageDialog(null,"YES! YES, MARY! JOHN DOES LOVE YOU!!!");	
	}
	

}
}


