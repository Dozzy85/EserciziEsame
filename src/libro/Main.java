package libro;

/*Una classe Libro con degli attributi autore, titolo, copie; un metodo che ci restituisce il numero di copie disponibili
 Se volessimo stampare i dettagli del libro?*/

public class Main {

	public static void main(String[] args) {
		
		Libro romanzo=new Libro("Romanzo Criminale", "BOOO", 8);
		System.out.println(romanzo.copieDisponibili("Romanzo Criminale"));
		System.out.println(romanzo.dettagli("Romanzo Criminale"));

	}

}
