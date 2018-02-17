import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
int d = Integer.parseInt(dimes);

// Tell them how many cents they have (hint: multiply by 10)
JOptionPane.showMessageDialog(null, "You have " + d * 10 + " cents.");


// Ask the user how tall they are (inches)
String height = JOptionPane.showInputDialog("How tall are you, in inches?");
int h = Integer.parseInt(height);
if (h < 36) {
	JOptionPane.showMessageDialog(null, "Okay, that's cool. You don't need to do anything you don't want to do. I won't tell you to eat anything, you are fine just the way you are.");
}
else {
	JOptionPane.showMessageDialog(null, "Good for you.");
}

// If they are shorter than 36 inches, tell them to eat their Wheaties




}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console
		for (int i = 1; i < 31; i += 1) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

	void skill3() { // Get a random number that is less than 20 and print it to the console
		int first = new Random().nextInt(20);
		int second = new Random().nextInt(10);
			System.out.println(first);
		// Get another random number that is less than 10 and print it to the console
			System.out.println(second);
		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction
			int dif = first - second;
			JOptionPane.showMessageDialog(null, "The difference between those last two numbers is " + dif);
	}

	void skill4() { // In a pop-up, ask the user for the city they live in
		String city = JOptionPane.showInputDialog("What city do you live in?");
		// If they answered "San Diego", tell them they live in Americ's Finest City
		if (city.equalsIgnoreCase("San Diego")) {
			JOptionPane.showMessageDialog(null, "Hey, that's a pretty great place to live.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Hey, that's a pretty great place to live. If you're happy there, you don't have to move because other people tell you to. I won't tell you to move anywhere if you are happy where you live.");
		}
		// Otherwise, tell them to move to San Diego
		
		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."
			String cars = JOptionPane.showInputDialog("How many cars does your family own?");
			int c = Integer.parseInt(cars);
		// If there is 1 car, use a pop-up to display the make/model of the car
			if (c == 0) {
				JOptionPane.showMessageDialog(null, "I bet you use public transportation. That's cool.");
			}
			if (c == 1) {
				String model = JOptionPane.showInputDialog("What is the model of your car?");
				JOptionPane.showMessageDialog(null, "Oh, I love " + model + "s!");
			}
		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.
			if (c > 1) {
				JOptionPane.showMessageDialog(null, "There are " + c * 4 + " wheels across your " + c + " cars.");
			}
	}

	void skill5() { // In a pop-up, ask the user for the name of their school
			String school = JOptionPane.showInputDialog("What is the name of your school?");
		// In another pop-up, tell the user, that their school is a fantastic school. //
		// You must include the name of the school in the message.
			JOptionPane.showMessageDialog(null, "Wow! " + school + " is a fantastic school!");
	}
}
