/// Name: Nanako Chung
// Date: April 4th, 2017
// Description: I created a library program that stores information about several books

import java.util.*;

//test class called TestBooks
public class TestBooks {

	//main method
	public static void main(String[] args) {
		//Scanner to process input
		Scanner input = new Scanner(System.in);

		//asks user how many books they would like to enter and processes the number as 'size'
		System.out.print("How many books would you like to enter: ");
		int size = input.nextInt();
		
		//creates an array of Books type called library
		Books[] library=new Books[size];

		//clears previous input to avoid conflicts
		input.nextLine();

		//for loop that asks the user for the description of each book accordingly
		for (int i=0; i<size; i++) {

			//creates a new Books() object every time the user puts in new information
			Books book = new Books();

			//asks the user for the title and sets that as the title of the current Books() object
			System.out.print("Please enter the title: ");
			String title=input.nextLine();
			book.setTitle(title);

			//asks the user for the author and sets that as the author of the current Books() object
			System.out.print("Please enter the author: ");
			String author=input.nextLine();
			book.setAuthor(author);

			//asks the user for the year published and sets that as the year published of the current Books() object
			System.out.print("Please enter the year published: ");
			int yearPub=input.nextInt();
			book.setYearPublished(yearPub);

			//clears previous input to avoid conflict
			input.nextLine();

			//asks the user for the number of pages and sets that as the number of pages of the current Books() object
			System.out.print("Please enter how many pages the book has: ");
			int numPgs=input.nextInt();
			book.setPgCount(numPgs);

			//clears previous input to avoid conflict
			input.nextLine();

			//asks the user for the genre and sets that as the genre of the current Books() object
			System.out.print("Please enter the genre: ");
			String genre=input.nextLine();
			book.setGenre(genre);		
			
			//assigns the book to its respective place in the library array
			library[i]=book;
			System.out.println("");
		} 
		//calls the summaries method
		summaries(library);
		System.out.println("There are "+Books.getCount()+" books in the system.");
		
	}
	//method that prints out a summary for each book entered by iterating through library array
	public static void summaries(Books[] library) {
		for (int i=0; i<library.length; i++) {
			System.out.println(library[i].getTitle()+" written by "+library[i].getAuthor()+" was published in "+library[i].getYearPublished()+", has "+library[i].getPgCount()+" pages and is of the "+library[i].getGenre()+" genre.");
		}
	}
}