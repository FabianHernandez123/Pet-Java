package pet;

public class Main {

	public static void main(String[] args) {
		//Testing classes out
		
		//Book class
		Book newLibro = new Book(750, "paperback", "autofiction");
		System.out.println(newLibro.bookSize());
		System.out.println(newLibro.isTextbook());
	}

}
