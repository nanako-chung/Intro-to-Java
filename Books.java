/// Name: Nanako Chung
// Date: April 4th, 2017
// Description: I created a library program that stores information about several books

//creates a class that can be used to describe books
public class Books {
	
	//creates private and static data fields accordingly
	private String title;
	private String author;
	private int yearPub;
	private int numPgs;
	private String genre;
	static int count;
	
	//default constructor
	public Books() {
		//adds 1 to count every time there is a new Books() object created
		count++;
	}
	
	//setter for title of current Books() object
	public void setTitle(String titleInput) {
		this.title=titleInput;
	}
	
	//getter for title of current Books() object
	public String getTitle() {
		return title;
	}
	
	//setter for author of current Books() object
	public void setAuthor(String authorInput) {
		this.author=authorInput;
	}
	
	//getter for author of current Books() object
	public String getAuthor() {
		return author;
	}
	
	//setter for year published of current Books() object
	public void setYearPublished(int yearInput) {
		this.yearPub=yearInput;
	}
	
	//getter for year published of current Books() object
	public int getYearPublished() {
		return yearPub;
	}
	
	//setter for page count of current Books() object
	public void setPgCount(int pgCountInput) {
		this.numPgs=pgCountInput;
	}
	
	//getter for page count of current Books() object
	public int getPgCount() {
		return numPgs;
	}
	
	//setter for genre of current Books() object
	public void setGenre(String genreInput) {
		this.genre=genreInput;
	}
	
	//getter for genre of current Books() object
	public String getGenre() {
		return genre;
	}
	
	//getter for counter
	public static int getCount() {
		return count;
	}
}
