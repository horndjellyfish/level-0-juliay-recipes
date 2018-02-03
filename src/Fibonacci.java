
public class Fibonacci {
	public static void main(String[] args) {
		for (int i = 0; i < 12; i += 1) {
			System.out.print(fib(i) + " ");
		}
	}
	private static int fib(int num) {
		if (num == 0) {
			return 1;
		}
		else if (num == 1) {
			return 1;
		}
		return fib(num - 2) + fib(num - 1);
	}
}