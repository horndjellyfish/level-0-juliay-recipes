import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("What percentage did you get on your test?");
		if (score.equals("90") || score.equals("91") || score.equals("92") || score.equals("93") || score.equals("94")
				|| score.equals("95") || score.equals("96") || score.equals("97") || score.equals("98")
				|| score.equals("99") || score.equals("100")) {
			JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for this test!");
		}
		if (score.equals("80") || score.equals("81") || score.equals("82") || score.equals("83") || score.equals("84")
				|| score.equals("85") || score.equals("86") || score.equals("87") || score.equals("88")
				|| score.equals("89")) {
			JOptionPane.showMessageDialog(null, "That's a pretty good score, but I think you can do better!");
		}
		if (score.equals("70") || score.equals("71") || score.equals("72") || score.equals("73") || score.equals("74")
				|| score.equals("75") || score.equals("76") || score.equals("77") || score.equals("78")
				|| score.equals("79")) {
			JOptionPane.showMessageDialog(null, "Aw, come on! I know you can do better than that!");
		}
		if (score.equals("60") || score.equals("61") || score.equals("62") || score.equals("63") || score.equals("64")
				|| score.equals("65") || score.equals("66") || score.equals("67") || score.equals("68")
				|| score.equals("69")) {
			JOptionPane.showMessageDialog(null, "Really? You know that's a failed grade, right? You have to try harder!");
		}
		
		if (score.equals("50") || score.equals("51") || score.equals("52") || score.equals("53") || score.equals("54")
				|| score.equals("55") || score.equals("56") || score.equals("57") || score.equals("58")
				|| score.equals("59")) {
			JOptionPane.showMessageDialog(null, "Are you even trying?");
		}
		
		if (score.equals("40") || score.equals("41") || score.equals("42") || score.equals("43") || score.equals("44")
				|| score.equals("45") || score.equals("46") || score.equals("47") || score.equals("48")
				|| score.equals("49")) {
			JOptionPane.showMessageDialog(null, "I'm not mad, just dissapointed...");
		
		}
		else {
			JOptionPane.showMessageDialog(null, "HOW? JUST HOW?");
		}
	}
}