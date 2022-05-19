package Mezzi;

/*modellare queste classi: autocarri e autoveicoli,
 * gli autocarri: capacità max di carico mentre autoveicoli: n porte,
 * in comunue hanno: targa, modello e n posti*/

public class Main {

	public static void main(String[] args) {
		
		Autocarri autocarro1=new Autocarri("BN526YT", "Ford", 5, 100);
		autocarro1.stampa();
		
		Autoveicoli autoveicoli1=new Autoveicoli("MN987UO", "Citroen", 5, 5);
		autoveicoli1.stampa();

	}

}
