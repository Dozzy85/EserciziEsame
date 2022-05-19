package esercizio_pila;

public class Main {

	public static void main(String[] args) {

		Pila p = new Pila();
		p.aggiungi(3);
		p.aggiungi(8);
		p.aggiungi(5);
		System.out.println("Pila");
		p.stampa();
		p.rimuovi();
		System.out.println("Pila dopo rimozione");
		p.stampa();

	}

}
