import javax.swing.JOptionPane;

public class Birthday_Reminder {
public static void main(String[] args) {
	String momsBirthday = "October 13";
	String dadsBirthday = "March 17";
	String sistersBirthday = "June 30";
	String OsistersBirthday = "August 28";
	String myBirthday = "August 24";
String rem = JOptionPane.showInputDialog("Whose birthday would you like to be reminded of?");
	if (rem .equals("Mom")) {
	JOptionPane.showMessageDialog(null, momsBirthday);
}	
	if (rem .equals("Dad")) {
	JOptionPane.showMessageDialog(null, dadsBirthday);
}	
	if (rem .equals("Julia")) {
	JOptionPane.showMessageDialog(null, myBirthday);
}
	if (rem .equals("Cece")) {
	JOptionPane.showMessageDialog(null, sistersBirthday);
}
	if (rem .equals("Olivia")) {
	JOptionPane.showMessageDialog(null, OsistersBirthday);
	
}
	else {
	JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
}
}
}