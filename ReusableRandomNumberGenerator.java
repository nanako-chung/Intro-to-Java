// Name: Nanako Chung
// Date: Feb 14th, 2017
// Description: I created a program that generates random numbers until the number 50 is output, along with how many tries it took to generate it

public class ReusableRandomNumberGenerator {

	public static void main(String[] args) {
		
		// declare 2 variables:
		// count, which will be the accumulator variable later on in the while loop
		int count=0;
		
		// TestNum, which generates a random number using the RandomNumGenerator method
		int TestNum;
		TestNum=RandomNumGenerator(0,100);
		
		// this while loop stops only if the random number generated is a 50
		// otherwise, the loop will constantly run 
		while (TestNum!=50) {
			TestNum=RandomNumGenerator(0,100);
			// every time the loop runs the count goes up by 1 to count the number of tries attempted until a 50 pops up
			count++;
			// prints the randomnum every time, regardless of whether it is a 50 or not
			System.out.println(TestNum);
		}
		
		// displays to the user how many times it took to get a 50
		System.out.println("It took "+count+" tries to get a "+TestNum);
	}

	// creates a method that spits out a single random number between num1 and num2 (inclusive bounds)
	public static int RandomNumGenerator(int num1, int num2) {
		int randomnum;
		randomnum = (int)(num1 + Math.random()*(num2 - num1 + 1));
		return randomnum;
	} 
}