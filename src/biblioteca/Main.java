package biblioteca;
import java.util.*;

/*Esercizio 7.8 pagina 64
Una biblioteca desidera gestire elettronicamente il proprio archivio. Per fare
cio` si implementi una classe Utente con le due variabili d'istanza String nome
e String cognome, un costruttore Utente(String unNome, String unCognome) ed i
metodi String getNome(), String getCognome() ed infine un metodo String
toString() che restituisce una stringa con una descrizione dell’oggetto
implicito, cioe` con i valori delle variabili d’istanza nome e cognome.
Si implementi inoltre una classe Libro con le tre variabili d'istanza int
codice, String titolo ed Utente utenteAssegnato. La variabile utenteAssegnato e`
di classe Utente e dovra` contenere un riferimento ad un oggetto di classe
Utente che ha in prestito il libro. Nel caso il libro non sia in prestito, la
variabile utenteAssegnato deve valere null. Implementare per la classe Libro un
costruttore Libro(int unCodice, String unTitolo), il quale pone la variabile
utenteAssegnato a null, ed i metodi Utente getUtenteAssegnato(), void
setUtenteAssegnato(Utente unUtente), int getCodice(), String getTitolo() e
String toString().
Implementare infine una classe Biblioteca avente le due variabili d'istanza
ArrayList libri e ArrayList utenti. La variabile libri contiene tutti i libri
della biblioteca. La variabile utenti contiene tutti gli utenti della
biblioteca. Ricordate che ciascun elemento della lista libri deve avere la
propria variabile d'istanza utenteAssegnato con il valore null oppure, nel caso
il libro sia stato assegnato ad un utente, tale variabile conterra` un
riferimento ad un utente presente nella lista utenti.

Sviluppare i seguenti metodi per la classe Biblioteca. Un costruttore
Biblioteca(). La biblioteca e` inizialmente vuota, cioe` non contiene alcun
libro ne' alcun utente. Un metodo void aggiungiUtente(String unNome, String
unCognome) che crea un nuovo utente e lo aggiunge alla lista utenti. Un metodo
void aggiungiLibro(int unCodice, String unTitolo) che crea un nuovo libro e lo
aggiunge alla lista libri. Per tale libro il valore della variabile d'istanza
utenteAssegnato dovra` essere null, poiche` il libro non e` ancora in prestito.
Un metodo void creaPrestito(int unCodice, String unCognome). Tale metodo
cerchera` nella lista libri un elemento avente il codice unCodice e cerchera`
nella lista utenti un utente avente il cognome unCognome. La variabile d'istanza
utenteAssegnato del libro trovato dovra` infine assumere come valore un
riferimento all'utente trovato, in modo da registrare il prestito. Infine,
sviluppare un metodo String toString() per visualizzare in forma di stringa lo
stato della biblioteca (tutti i suoi libri ed utenti).
Consigli:
Si assuma che non esistano piu` libri con lo stesso codice, e che non esistano
piu` utenti con lo stesso cognome. Le classi Utente e Libro non presentano
particolari difficoltà. Nella classe biblioteca il metodo creaPrestito(int
unCodice, String unCognome) per implementarlo e` necessario svolgere due
operazioni di ricerca, puo` essere d'aiuto in questo caso usare due metodi
ausiliari per svolgere tali ricerche.*/

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Biblioteca genna = new Biblioteca();
		boolean d = false;
		
		while (!d){
		System.out.println("Scegliere l'operazione da effettuare:");
		System.out.println("1) aggiungi un utente");
		System.out.println("2) aggiungi un libro");
		System.out.println("3) crea un prestito");
		System.out.println("4) stampa il contenuto della biblioteca");
		System.out.println("5) esci");
		
		int operazione = in.nextInt();
		
		if (operazione == 1){
		System.out.println("Scegliere il nome utente:");
		String a= in.nextLine();
		String nome = in.nextLine();
		System.out.println("Scegliere il cognome utente:");
		String cognome = in.nextLine();
		genna.aggiungiUtente(nome,cognome);
		}else if (operazione == 2){
		System.out.println("Scegliere il titolo del libro:");
		String a= in.nextLine();
		String titolo = in.nextLine();
		System.out.println("Scegliere il codice del libro:");
		int codice = in.nextInt();
		genna.aggiungiLibro(codice,titolo);
		}else if (operazione == 3){
		System.out.println("Scegliere il cognome dell'utente che richiede il prestito:");
		String a= in.nextLine();
		String cognome = in.nextLine();
		System.out.println("Scegliere il codice del libro da prestare:");
		int codice = in.nextInt();
		genna.creaPrestito(codice,cognome);
		}else if (operazione == 4){
		System.out.println("Il contenuto della biblioteca:");
		System.out.println(genna.toString());
		}else if (operazione == 5){
		d = true;
		}
		}
		}

}
