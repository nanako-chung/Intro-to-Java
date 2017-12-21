// Name: Nanako Chung
// Date: Feb 21st, 2017
// Description: the following program counts the number of times a digit appears in an array of 20 integers (all between 0 and 9)

public class CountThoseDigits {

	// main method
	public static void main(String[] args) {
		// new array with 20 integer elements
		int [] array = new int[20];

		// iteration of array through for loop
		for (int i=0; i<array.length; i++) {
			// inserts a random number between 0 and 9 into the array
			array[i] = (int)(Math.random() * 10); 

			// repeating a call for the method below 9 times
		} for (int j=0; j<10; j++) {
			search(array, j);
		}
	}

	// method that returns the number of times j/key appeared in the array 
	public static void search(int[]countArray, int key) {
		// creates an accumulator variable
		int count=0;
		// for loop that iterates through the array
		for (int k=0; k<countArray.length; k++) {
			// if the key is found in the array, count goes up by 1
			if (countArray[k]==key) {
				count+=1; }

			// for grammatic correction:
		} if (count==1) {
			System.out.println("There was 1 "+key);
		} else if (count==0) {
			System.out.println("There were no "+key+"'s");
		} else 
			System.out.println("There were "+count+" "+key+"'s");
	}
}