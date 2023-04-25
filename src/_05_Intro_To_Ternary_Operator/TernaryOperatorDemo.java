package _05_Intro_To_Ternary_Operator;

import java.util.Scanner;

public class TernaryOperatorDemo {

	/*
	 * A ternary operator is a "syntactic sugar" alternative to if/else statements
	 * that allows you to write an if/else statement on a single line and set a
	 * value.
	 */

	public static void main(String[] args) {

		int x = 5;

		/*
		 * The following ternary operator checks if x is equal to 5(the if condition).
		 * 
		 * If the condition is true it will return the first value after the ? of x * 5
		 * otherwise it will return the second value after the : of x / 5.
		 * 
		 * 1. Try running the program once then change the value of x and run it again
		 */

		// "if X...is equal to 5...return x*5...otherwise return x/5
		x = x == 5 ? x * 5 : x / 5;
		// "x =" means that it is starting off by saying "this will be about x"(ex "IF
		// X....")
		// "x == 5" is the main statement, checks to see if x is 5
		// "?" means that "okay, if the first statement is true(x IS equal to 5),
		// then run whatever is after me(im the ?)
		// however the ":" says "okay, if the ? didn't do anything, just run what's
		// after ME(im the :)

		x = x == 5 ? x * 5 : x / 5; // MAIN CODE--------------------------------------
		System.out.println(x);

		/*
		 * 2. Ask the user what season it is and saves their input through use of a
		 * Scanner.
		 * 
		 * 3. Use a ternary operator to evaluate the user response. If they say
		 * "duck season" then set their input to instead be "FIRE!". Otherwise set it to
		 * "rabbit season".
		 * 
		 * 4. Surround the previous parts with a do while loop and continue until the
		 * response says "FIRE!".
		 */
		Scanner scan = new Scanner(System.in);
		String answer;
		do {
			System.out.println("What season is ti?");
			answer = scan.nextLine();
			answer = answer.equals("duck season") ? "FIRE!" : "rabbit season";
		} while (!answer.equals("FIRE!"));

		System.out.println(answer);
		scan.close();
		// varible = condition ? expression1 : expression2 ;

		/*
		 * WARNING: Ternary operators can be used to improve the readability of your
		 * code if used sparingly for very simple if/else statements.
		 * 
		 * However, if you have nested Ternary statements or more complex if/else
		 * statements please use switch statements or normal if/else statements for the
		 * sake of all who must read your code.
		 */

	}

}
