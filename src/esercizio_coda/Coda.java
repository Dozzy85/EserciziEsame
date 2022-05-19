package esercizio_coda;

import java.util.LinkedList;
import java.util.Queue;

public class Coda {

	private Queue<Integer> coda;

	public Coda() {
		coda = new LinkedList<>();
	}

	public void aggiungi(int unVal) {
		coda.offer(unVal);
	}

	public void rimuovi() {
		coda.poll();
	}
	
	public void stampa() {
			System.out.println(coda);
	}

}
