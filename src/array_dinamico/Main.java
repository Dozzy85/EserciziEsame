package array_dinamico;

import java.util.Vector;

/*creazione array dinamico con inserimento e cancellazione*/

public class Main {

	public static void main(String[] args) {
		
		Vettore v1=new Vettore();
		
		v1.aggiungiElemento(1);
		v1.aggiungiElemento(2);
		v1.aggiungiElemento(3);
		v1.aggiungiElemento(4);
		v1.stampa();
		v1.rimuovi(3);
		v1.stampa();

	}

}
