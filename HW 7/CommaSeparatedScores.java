// Name: Nanako Chung
// Date: April 10th, 2017
// Description: comma separating program that results with the average of the scores inputted by user

// allows for the use of Scanner class
import java.util.*;

public class CommaSeparatedScores {

	//main method
	public static void main(String[] args) {
		
		//calls scanner
		Scanner input = new Scanner(System.in);
		
		//asks the user to enter a string of scores with no spaces (just commas) and inputs that into the string 'scores'
		System.out.print("please enter the string of scores, separated by commas: ");
		String scores=input.nextLine();
		
		//'scores' is split up by commas and each split string is put into an array
		String[] splitScores=scores.split(",");
		
		//accumulator variable that will eventually get the sum of the scores in the array
		double sumScores=0;
		
		//iterates over each element in the array, turns each element into a double, and adds it to the accumulator variable
		for (int i=0;i<splitScores.length;i++) {
			double score=Double.parseDouble(splitScores[i]);
			sumScores+=score;
		}
		
		//computes the average and displays to user
		double avg=(sumScores/splitScores.length);
		System.out.println("Average score is "+avg);
	}

}
