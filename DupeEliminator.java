// Name: Nanako Chung
// Date: Feb 21st, 2017
// Description: this program eliminates duplicates in an array and returns the clean array to the user


import java.util.Arrays;

public class DupeEliminator {

	// main method
	public static void main(String[] args) {
		// input array
		int[] array = {4,5,5,5,2,3,1};
		// calls the method below
		deleteDupes(array);
	}

	// method that takes in integers and returns an array without any dupes
	public static void deleteDupes(int[] array) {
		// creates a variable 'count' that goes down every time a duplicate is found
		int count=array.length;
		
		// outer for loop: iterates through every element in array
		for (int i=0; i<array.length; i++) {
			// inner for loop: iterates through every element before array[i]
			for (int j=0; j<i; j++) {
				// if there is an element that is equal to array[i], decrease the count by 1 because there is a dupe!
				if (array[i]==array[j]){
					count-=1;
					// break prevents from counting the integer at array[i] twice (if found again) (e.g. array[3]=array[1]=array[2]. we don't want to count 5 twice!)
					break;
				}
			}
		} 
		
		// creates a new array the size of the previous array without dupes
		int [] newArray = new int [count];
		// first element can never be a dupe!
		int indexCount = 1;

		// outer for loop: iterates through every element in array
		for (int a=0; a<array.length; a++) {
			// excludes the first element in the array because it can never be a double
			if (a==0){
				newArray[0]=array[a];
			}
			// accumulator variable called 'total' to add the number of attempts until an index with the same element is found
			int total = 0;
			// inner for loop: iterates through every element before array[a]
			for (int b=0; b<a; b++) {
				
				// if array[b] is not a dupe of array[a], increase the number of attempts (total) by 1
				if (array[a]!=array[b]){
					total+=1;
					
					// if total==a, that means that there were no dupes found at any previous index and so the indexCount is the index of the non-dupe
					// we include this in our newArray!
					if (total==a){
						newArray[indexCount] = array[a];
						// the indexCount goes up by 1 every time the if statement is carried out to avoid putting a new element in the same position and essentially replacing the previous one 
						indexCount+=1;
					}
				} 
			} 
		} // display the clean array without dupes to the user!
		System.out.println(Arrays.toString(newArray));
	}
}