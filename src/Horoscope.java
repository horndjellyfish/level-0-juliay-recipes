import javax.swing.JOptionPane;

public class Horoscope {
		public static void main(String[] args) {
			String A = "Aries";
			String T = "Taurus";
			String G = "Gemini";
			String C = "Cancer";
			String L = "Leo";
			String V = "Virgo";
			String Lb = "Libra";
			String S = "Scorpio";
			String Sg = "Sagittarius";
			String Cp = "Capricorn";
			String Aq = "Aquarius";
			String P = "Pisces";
			String ans = JOptionPane.showInputDialog("What is your star sign?");
			if (ans .equals(A)) {
				JOptionPane.showMessageDialog(null, "Aries are courageous, determined, confident, enthusiastic, optimistic, honest, and passionate. \nIt is their nature to take action, sometimes before they think about it well. An Aries is ready to be the hero of the day.");
			}
			else if (ans .equals(T)) {
				JOptionPane.showMessageDialog(null, "Taurus are reliable, patient, practical, devoted, responsible, and stable. \nThey feel the need to always be surrounded by love and beauty. They are sensual and tactile, stable and conservative. \nTaurus is ready to endure and stick to their choices until they reach the point of personal satisfaction.");
			}
			else if (ans .equals(G)) {
				JOptionPane.showMessageDialog(null, "Gemini are gentle, affectionate, curious, and adaptable. \nThey are sociable, ready for fun. They are fascinated with the world itself, \nextremely curious, with a constant feeling that there is \nnot enough time to experience everything they want to see.");
			}
			else if (ans .equals(C)) {
				JOptionPane.showMessageDialog(null, "Cancer are tenacious, highly imaginative, loyal, emotional, sympathetic, and persuasive. \nThey can be one of the most challenging signs to get to know. \nThey are very emotional and sensitive, and care deeply about matters of the family and their home.");
			}
			else if (ans .equals(L)) {
				JOptionPane.showMessageDialog(null, "Leo are creative, passionate, generous, warm-hearted, cheerful, and humorous. \nThey are dramatic, self-confident, dominant, and extremely difficult to resist. \nLeo often has many friends for they are generous and loyal. This is a sign capable of uniting different groups of people and \nleading them as one towards a shared cause, and their healthy sense of humor makes collaboration with other people even easier.");
			}
			else if (ans .equals(V)) {
				JOptionPane.showMessageDialog(null, "Virgo are loyal, analytical, kind, hardworking, and practical. \nThey are always paying attention to the smallest details and their deep sense of humanity makes them one of the most careful signs. \nVirgo's methodical approach to life ensures that nothing is left to chance, and although they are often tender, \ntheir heart might be closed for the outer world.");
			}
			else if (ans .equals(Lb)) {
				JOptionPane.showMessageDialog(null, "Libra are cooperative, diplomatic, gracious, fair-minded, and social. \nThey hate being alone. Partnership is very important for them, as their mirror and someone giving them the ability to be the mirror themselves. \nLibra is fascinated by balance and symmetry. They are ready to do nearly anything to avoid conflict, \nkeeping the peace whenever possible.");
			}
			else if (ans.equals(S)) {
				JOptionPane.showMessageDialog(null, "Scorpio are resourceful, brave, passionate, stubborn, and a true friend. \nThey are determined and decisive, and will research until they find out the truth. \nScorpio is a great leader, always aware of the situation and also features prominently in resourcefulness. \nThey live to experience and express emotions. They will keep your secrets, whatever they may be. \nScorpios are known by thier calm and cool behavior. Some say Scorpios are fierce. Scorpios are brave, and therefore have many friends.");
			}
			else if (ans.equals(Sg)) {
				JOptionPane.showMessageDialog(null, "Sagittarius are generous, idealistic, and have a great sense of humor. \nCurious and energetic, they are one of the biggest travelers among all signs. They are extroverted, optimistic, and enthusiastic, \nand like changes. They will do anything to achieve their goals. Freedom is their greatest treasure, because only then they \ncan freely travel and explore different cultures and philosophies. Because of their honesty, \nSagittarius are often impatient and tactless when they need to say or do something.");
			}
			else if (ans.equals(Cp)) {
				JOptionPane.showMessageDialog(null, "Capricorn are responsible, disciplined, self-controlled, and they are good managers. \nThey possess an inner state of independance that enables significant progress both in their personal and professional lives. \nThey have the ability to lead the way, make solid and realistic plans, and manage many people who work for them at any time. \nThey will learn from their mistakes and get to the top based solely on their experience and expertise.");
			}
			else if (ans.equals(Aq)) {
				JOptionPane.showMessageDialog(null, "Aquarius are progressive, original, independant, and humanitarian. \nThey are shy and quiet, but they can be eccentric and energetic. They are deep thinkers and highly intellectual people who love helping others. \nAquarius have a deep need for some time alone and away from everything, in order to restore power. \nThey are capable of perceiving the future and they know exactly what they want to be doing five or ten years from now. \nAqarius need to learn to trust others and express their emotions in a healthy way.");
			}
			else if (ans.equals(P)) {
				JOptionPane.showMessageDialog(null, "Pisces are compassionate, artistic, intuitive, gentle, wise, and musical. \nThey are very friendly, so they often find themsleves in a company of very different people. Pisces are selfless, \nthey are always willing to help others, without hoping to get anything back. They are never judgmental and always forgiving. \nPisces are also known to be the most tolerant of all the signs.");
			}
			else {
				JOptionPane.showMessageDialog(null, "That's not a star sign!");
			}
		
		}
}
