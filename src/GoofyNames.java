import javax.swing.JOptionPane;
public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";
		// 1. Ask the user to enter their name
		String name = JOptionPane.showInputDialog("What is your name?");
		// 2. Print upper case name to the console using .toUpperCase()
		//System.out.println(name.toUpperCase());
		//System.out.println(name.length());
		//    Run your program to see that this works.
		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.
			// 4. Create a String variable to store the next character of the name
			//    using .substring(start, end)
		int i;
		int length = name.length();
		for (i = 0; i < length-1; i+=1); {
			String current = name.substring(i, i+1); 
			//System.out.println(current);
		}
			//    HINT: replace 'start' and 'end' to get String with character at i 
			
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			//    and lower case for ODD characters.
		
			String current = name.substring(i, i+1); 
		
			if (i+1 % 2 == 0) {
				System.out.println(current.toUpperCase());
				
			} 
			else { 
				System.out.println(current);
			}
		 
			// 6. ADD this String  (containing 1 char) to the goofyName String
		
		// 7. Use pop-up to show user their Goofy name
	}
}


