package pet;

public class Book {
	private int numberPages;
	private String coverType;
	private String genre; 
	
	public Book() {}
	
	public Book(int numberPages, String coverType) {
		this.numberPages = numberPages;
		this.coverType = coverType;
	}
	
	public Book(int numberPages, String coverType, String genre) {
		this.numberPages = numberPages;
		this.coverType = coverType;
		this.genre = genre; 
	}
	
	public int getPages() {
		return numberPages; 
	}
	
	public String getCover() {
		return coverType; 
	}
	
	public String getGenre() {
		return genre; 
	}
	
	public void setPages(int numberPages) {
		this.numberPages = numberPages; 
	}

	public void setCover(String coverType) {
		this.coverType = coverType;
	}
	
	public void setGenre(String genre) {
		this.genre = genre; 
	}
	
	public boolean isTextbook(String genre) {
		return genre.equalsIgnoreCase("textbook");
	}
	
	public String bookSize(int numberPages) {
		if (numberPages<=150) {
			System.out.println("That's a short book");
		} else if (numberPages > 150 && numberPages <= 350) {
			System.out.println("A medium sized text");
		} else if (numberPages > 350 && numberPages <= 700) {
			System.out.println("How long's that going to take to read?");
		} else {
			System.out.println("That's a tome or a brick.");
		}
	}
	
}
