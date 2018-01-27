
public class Fibonacci {
	public static void main(String[] args) {
		for(int i = 1; i < 145; i += i + i - 1) {
			System.out.println(i);
		}
	}	
}