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
	
	public boolean isTextbook() {
		return genre.equalsIgnoreCase("textbook");
	}
	
	public String bookSize() {
		String output; 
		if (numberPages<=150) {
			output = "That's a short book";
		} else if (numberPages > 150 && numberPages <= 350) {
			output = "A medium sized text";
		} else if (numberPages > 350 && numberPages <= 700) {
			output = "How long's that going to take to read?";
		} else {
			output = "That's a tome or a brick.";
		} return output; 
	}
	
}
