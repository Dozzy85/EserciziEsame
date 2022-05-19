package esercizio_pila;

import java.util.Stack;

public class Pila {

	private Stack<Integer> pila;

	public Pila() {
		pila = new Stack<>();
	}

	public void aggiungi(int unVal) {
		pila.push(unVal);
	}

	public void rimuovi() {
		pila.pop();
	}

	public void stampa() {
		System.out.println(pila);
	}

}
