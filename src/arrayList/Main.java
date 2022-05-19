package arrayList;

/*Esercizio 7.1
Realizzare una classe cancArrayList che cancelli i numeri pari presenti in un
ArrayList di interi. Tale classe presenta una sola variabile di istanza private
ArrayList<Integer> lista, creare quindi un metodo void inserisci(int n) che
inserisca nell’ArrayList lista il numero intero passato come parametro
esplicito, creare un metodo void cancLista() che cancelli dall’ArrayList lista
tutti gli interi pari, implementare infine un metodo String stampa che
restituisce sottoforma di stringa il contenuto dell’ ArrayList lista.
Consigli:
Si raccomanda di prestare molta attenzione al metodo cancLista(), poichè essendo
lista un ArrayList, ogni volta che un oggetto viene eliminato, tutti gli oggetti
successivi vengono spostati automaticamente (il loro indice viene decrementato
di una unità). Nel nostro caso se ci troviamo ad avere più interi pari
consecutivi nall’ArrayList lista non tutti verranno cancellati(se usiamo un for
che visita l’ArrayList dall’inizio alla fine). Ci sono solo due modi per
cancellare con successo più elementi contigui da un ArrayList: (primo)fare in
modo che il for visiti gli elementi dall’ultimo al primo; (secondo) ogni volta
che un elemento viene cancellato decrementare l’indice di una unità. Si prega di
implementare, per esercizio, due diversi metodi cancListaPrimo() e
cancListaSecondo().
 */

public class Main {

	public static void main(String[] args) {
		cancArrayList lista1=new cancArrayList();
		lista1.inserisci(3);
		lista1.inserisci(4);
		lista1.inserisci(6);
		lista1.inserisci(7);
		System.out.println(lista1.stampa());
		lista1.cancLista();
		System.out.println(lista1.stampa());

	}

}
