// Copyright Wintriss Technical Schools 2013
/**
 * Fizz Buzz
 * 
 * In this project, we're going to build FizzBuzz. It's a children's game where
 * you count from 1 to 20. Easy, right? Here's the catch: instead of saying
 * numbers divisible by 3, say "Fizz". And instead of saying numbers divisible
 * by 5, say "Buzz". For numbers divisible by both 3 and 5, say "FizzBuzz".
 * 
 * So the rules are: Any number divisible by 3 is replaced by the word fizz Any
 * number divisible by 5 is replaced by the word buzz. Numbers divisible by both
 * 3 and 5 become fizzbuzz.
 * 
 * Print your results to the console, or using JOptionPane if you like.
 **/

public class Fizzbuzz {
	public static void main(String[] args) {
		for (int z = 1; z < 21; z += 1) {
			int fizzbuzz = z + 1;
			if (z == 15)
				System.out.println("fizzbuzz");
			else if (z % 3 <= 0) {
				System.out.println("fizz");
			} else if (z % 5 <= 0) {
				System.out.println("buzz");
			} else {
				System.out.println(z);

			}
		}
	}
}
