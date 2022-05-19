package lettore_video;

/*Una società che produce apparecchi multimediali desidera sviluppare il software
per la gestione di un lettore video portatile. Si consideri la classe Genere,
avente come variabile d'istanza un nome (stringa) ed un numero di
visualizzazioni (intero). Si consideri inoltre la classe Video, avente come
variabili d'istanza un titolo (stringa) ed un riferimento ad un oggetto di
classe Genere. Si assuma siano già disponibili gli usuali metodi costruttori,
accessori e modificatori per ciascuna delle due classi. Sviluppare la seguente
classe:
public class LettoreVideo {
private ArrayList<Video> video;
private Genere[] generi;
private int numGeneri;
private final int MAX_GENERI = 35;
public LettoreVideo(){...}
public void aggGenere(String unNome){...}
public void aggVideo(String unTitolo, String unGenere){...}
public void playVideo(String unTitolo){...}
public int contaVideo(String unGenere){...}
public void rimuoviGenere(String unGenere){...}
public ArrayList<Genere> top(int soglia) {...}
}
Le variabili d'istanza video e generi contengono rispettivamente tutti i video
ed i generi presenti nel
lettore. La variabile generi è un array di dimensione MAX GENERI, e deve essere
gestito come un array parzialmente riempito. Il metodo aggVideo inserisce nel
lettore un nuovo video (se non esiste già) con un riferimento all'oggetto di
classe Genere appropriato nella arraylist generi. Se il genere non esiste già,
deve essere creato un oggetto che lo rappresenti. Il metodo playVideo incrementa
di una unità il numero di visioni del genere associato al video specificato. Il
metodo contaVideo restituisce il numero di video presenti nel lettore che sono
stati classificati con il genere specificato. Il metodorimuoviGenere rimuove dal
lettore il genere specificato assieme a tutti i video classificati con tale
genere. Il metodo top restituisce una lista con tutti i generi che hanno
totalizzato un numero di visioni pari o superiore alla soglia indicata.
Consiglio:
In questo esercizio la difficoltà è gestire un array parzialmente riempito, cosa
che viene spesso richiesta negli esercizi d’esame. Per questo il presente
esercizio verrà ampliamente commentato al fine di renderlo il più chiaro
possibile.*/

public class Main {

	public static void main(String[] args) {
		
		LettoreVideo sony = new LettoreVideo();
		sony.aggGenere("horror");
		sony.aggGenere("azione");
		sony.aggGenere("fantasy");
		sony.aggVideo("thor","fantasy");
		sony.aggVideo("come d'incanto","romantico");
		sony.aggVideo("harry potter","fantasy");
		sony.aggVideo("il signore degli anelli","fantasy");
		sony.aggVideo("matrix","azione");
		sony.aggVideo("skyfall","azione");
		sony.aggVideo("saw","horror");
		sony.playVideo("matrix");
		sony.playVideo("skyfall");
		sony.playVideo("saw");
		System.out.println(sony.contaVideo("fantasy"));
		System.out.println(sony.contaVideo("azione"));
		System.out.println("prova top:");
		System.out.println(sony.top(1));
		sony.rimuoviGenere("fantasy");
		System.out.println(sony.top(2));
		}

}
