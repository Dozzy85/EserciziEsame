package esercizio_coda;

/*implementare una classe Coda che gestisce una coda di numeri interi, e una classe Main che ne esegue il test.
   Una coda una struttura dati che memorizza una lista di elementi, accessibili tramite la modalità FIFO, First In First Out.
   Le operazioni che si possono fare su una pila sono 2:
         - inserimento di un elemento: viene inserito un nuovo elemento alla fine,
         - rimozione di un elemento: viene rimosso il primo elemento della lista.
   Un esempio di coda è la fila per entrare in una giostra: la persona che entra per prima nella coda, sara' la prima a uscirne 
   per entrare nella giostra, e quando ciò avviene tutte le altre persone si spostano avanti di un posto; invece una nuova*/

public class Main {

	public static void main(String[] args) {

		Coda c = new Coda();
		c.aggiungi(5);
		c.aggiungi(3);
		c.aggiungi(8);
		System.out.println("Coda");
		c.stampa();
		c.rimuovi();
		System.out.println("Coda dopo il rimuovi");
		c.stampa();

	}

}
