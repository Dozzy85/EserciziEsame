package autorimessa;

/*esercizio 7.6
 Progettare una classe di nome Autorimessa, per rappresentare un parcheggio per
automobili.
Tale classe prevede una variabile di istanza. La variabile e' definita come
Arraylist<String> box, che rappresenta una lista con le targhe delle auto
parcheggiate nella autorimessa.
La classe deve avere un costruttore public Autorimessa(), che inizializza
l’ArrayList box. Un metodo definito come public void parcheggia(String
unaTarga), che parcheggia un’auto. Un metodo definito come public void
rimuovi(String unaTarga), che elimina l’auto con targa specificata dal parametro
esplicito dal parcheggio. Un metodo public int numeroAuto(), che restituisce il
numero di auto presenti nel parcheggio.
Nel parcheggio non possono esservi più auto con la medesima targa.
Consigli:
Consigliabile implementare un metodo ausiliario private int cercaTarga(String
unaTarga) che cerca una targa nell’ArrayList box.*/

public class Main {

	public static void main(String[] args) {
		
		Autorimessa prova = new Autorimessa();
		prova.parcheggia("AY050JD");
		prova.parcheggia("AY050JD");
		prova.parcheggia("VY123FG");
		prova.parcheggia("SA100TA");
		prova.parcheggia("RA593IS");
		System.out.println(prova.numeroAuto());
		prova.rimuovi("AY050JD");
		System.out.println(prova.numeroAuto());

	}

}
