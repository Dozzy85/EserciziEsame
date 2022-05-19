package veicoli;

/*modellare queste classi: autocarri e autoveicoli,
 * gli autocarri: capacità max di carico mentre autoveicoli: n porte,
 * in comunue hanno: targa, modello e n posti*/
public class Main {

	public static void main(String[] arg) {

		Autocarri carro1 = new Autocarri("dgsd", "fhajks", 3, 100);
		System.out.println(carro1.toString());

		Autoveicoli auto1 = new Autoveicoli("sfkjhbsf", "sahgd", 2);
		System.out.println(auto1.toString());

	}

}
