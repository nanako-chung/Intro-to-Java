// Name: Nanako Chung
// Date: Feb 7th, 2017
// Description: I created a program that allows for the user to play rock-paper-scissors with the computer

// allows for the use of the Scanner class
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// calls the Scanner method
		Scanner input = new Scanner(System.in);

		// prompts the user for a number between 0 and 2 and stores the input into the variable 'userchoice'
		System.out.println("Choose your weapon: rock(0), paper(1), scissors (2): ");
		int userchoice = input.nextInt();

		// chooses a random integer between 0 and 2 using the Math method
		int computerchoice = (int)(Math.random()*3);

		// if the user's choice is the same as the computer's choice, then the game results in a tie. we display this to the user
		if (userchoice==computerchoice) {
			System.out.println("It's a draw!");

		// otherwise, if the choices are not the same, then create if-scenarios based on what the user chooses
		} else {
			
			// if the user chooses rock, s/he will lose to paper and win over scissors
			if (userchoice==0) {
				if (computerchoice==2) {
					System.out.println("Rock crushes scissors. You win!");
				} else {
					System.out.println("Paper covers rock. You lose!"); }

			// if the user chooses paper, s/he will win over rock and lose to scissors
			} else if (userchoice==1) {
				if (computerchoice==0) {
					System.out.println("Paper covers rock. You win!");
				} else {
					System.out.println("Scissors cut paper. You lose!"); }

			// if the user chooses scissors, s/he will win over paper and lose to rock
			} else if (userchoice==2) {
				if (computerchoice==1) {
					System.out.println("Scissors cut paper. You win!");
				} else {
					System.out.println("Rock crushes scissors. You lose!"); }

			// if the choice exceeds 2 or goes below 0, then the choice is invalid and this result is displayed to the user
			} else {
				System.out.println("Not a valid choice"); }
		}
	}
}
