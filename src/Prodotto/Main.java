package Prodotto;

/*Scrivere un programma che dati 2 numeri naturali calcola il prodotto
 * dei due numeri tramite la somma e stampa il risultato
 */

public class Main {

	public static void main(String[] args) {
		
		ProdottoNumeri prod=new ProdottoNumeri(3,5);
		
		System.out.println("La somma è: "+prod.sommatore());

	}

}
