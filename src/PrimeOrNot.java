import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
	String num = JOptionPane.showInputDialog("Give me a number.");
	int i = Integer.parseInt(num);
	if (i == 2) {
		JOptionPane.showMessageDialog(null, "2 is a prime number.");
	}
	for (int abc = 2; abc < i; abc += 1);
		int abc = 2;
			if (i % abc <= 0) {
			JOptionPane.showMessageDialog(null, i + " is not a prime number; it is composite.");	
			} else {
				JOptionPane.showMessageDialog(null, i + " is a prime number.");
			}
				

		}
	
	}


