package pet;

public class Main {

	public static void main(String[] args) {
		//Testing classes out
		
		//Book class
		Book newLibro = new Book(750, "paperback", "autofiction");
		System.out.println("Book size: " + newLibro.bookSize());
		System.out.println("Is this a textbook? " + newLibro.isTextbook());
		
		//Pet class
		Pet bunnicula = new Pet("bunnicula", 7, "Iceland", "Rabbit");
		bunnicula.setName("Cloudy2.0");
		System.out.printf("Rabbit name: %s", bunnicula.getName());
	}

}
