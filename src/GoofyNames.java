import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";
		// 1. Ask the user to enter their name
		String name = JOptionPane.showInputDialog("What is your name?");
		// 2. Print upper case name to the console using .toUpperCase()
		System.out.println(name.toUpperCase());
		// Run your program to see that this works.
		// 3. Loop through each character of the name (steps 4 - 6).
		// HINT: Use .length() to determine the number of characters in the String.
		// 4. Create a String variable to store the next character of the name
		// using .substring(start, end)
		int length = name.length();
		for (int i = 0; i < length; i += 1) {
			String current = name.substring(i, i + 1);

			// HINT: replace 'start' and 'end' to get String with character at i

			// 5. Use MODULO to set this variable to upper case for EVEN characters
			// and lower case for ODD characters.

			if (i % 2 == 0) {
				System.out.println(current.toUpperCase());
				goofyName += current.toUpperCase();
			} else {
				System.out.println(current);
				goofyName += current;
			}
		}
		// 6. ADD this String (containing 1 char) to the goofyName String

		// 7. Use pop-up to show user their Goofy name
		JOptionPane.showMessageDialog(null, goofyName);
	}
}
