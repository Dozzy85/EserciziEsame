package car_sharing;

/*Una societa’ di car sharing intende dotarsi di un programma per gestire il
proprio parco automobili. Si assumano le classi Parcheggio, avente la variabile
d’istanza nome (stringa), e Automobile,
avente le variabili d’istanza targa (stringa), viaggi (intero), e locazione
(riferimento a Parcheggio).
Assumere gli usuali metodi di accesso e modifica per tali classi senza
sviluppare il codice.
Sviluppare tutti i metodi della classe CarSharing, definita come di seguito:
public class CarSharing {
private ArrayList<Parcheggio> parcheggi;
private ArrayList<Automobile> automobili;
public CarSharing(){...};
public void aggiungiParcheggio(String unNome){...};
public void aggiungiAutomobile(String unaTarga, String unNomeParcheggio){...};
public void transito(String unaTarga, String parcheggioArrivo){...};
public int contaAutomobili(String unNomeParcheggio){...};
public void rimuoviAutomobili(int unNumeroViaggi){...};
public String statistica(){...};
};
Il metodo aggiungiParcheggio aggiunge un nuovo parcheggio, senza creare
duplicati. Il metodo
aggiungiAutomobile aggiunge una nuova automobile senza creare duplicati, e la
assegna al parcheggio
indicato. Creare il parcheggio se questo non esiste gi`a; la nuova automobile
deve avere un numero
di viaggi pari a zero. Il metodo transito sposta l’automobile indicata ad un
nuovo parcheggio, ed
incrementa di una unit`a il numero di viaggi. Il metodo contaAutomobili
restituisce il numero di
automobili presenti nel parcheggio indicato. Il metodo rimuoviAutomobili rimuove
dal sistema tutte
le automobile che abbiano compiuto un numero di viaggi uguale o superiore alla
quantit`a indicata.*/

public class Main {

	public static void main(String[] args) {
		
	}

}
