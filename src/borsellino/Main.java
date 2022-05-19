package borsellino;

/*Esercizio 7.2
Realizzare una classe Purse (“borsellino”), che simula una raccolta di monete.
Per semplicità, si memorizzeranno solo i nomi delle monete in un
ArrayList<String>.
Fornire i seguenti metodi: un construttore che che crea un oggetto Purse vuoto,
un metodo public void addCoin(String coinName) che inserisce una moneta al purse
e un metodo toString che stampa le monete presenti nel borsellino, nel formato
seguente: Purse[Quarter, Dime, Nickel, Dime].
Consigli:
Si raccomanda d’importare la classe ArrayList, altrimenti Java non riesce ad
individuare il comando “add” del metodo void addCoin(String coinName). La
maggiore difficoltà si incontra nel metodo toString, dove si usa un ciclo for
per visitare l’ArrayList coins e stamparne il contenuto.*/

public class Main {

	public static void main(String[] args) {
		Purse borsello=new Purse();
		borsello.addCoin("Quarter");
		borsello.addCoin("Dime");
		borsello.addCoin("Nickel");
		borsello.addCoin("Dime");
		System.out.println(borsello.stampa());

	}

}
