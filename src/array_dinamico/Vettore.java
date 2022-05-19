package array_dinamico;

import java.util.*;

public class Vettore {
	
	private Vector<Integer> v=new Vector<>();
	
	public void aggiungiElemento(int unValore) {
		v.add(unValore);
	}
	
	public void rimuovi(int unValore) {
		v.removeElement(unValore);
	}
	
	public void stampa() {
		System.out.println(v);
	}

}
