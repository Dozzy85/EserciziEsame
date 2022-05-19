package gestione_veicoli;

/*gestione veicoli, modellare tipologie di veicoli(autoveicolo, autocarro...)
   realizzare un prodotto software per la gestione dei veicoli, quindi 2 classi (auto e autocarri) con i seguenti attributi:
   auto: targa, modello, numero posti, marca, numeroPorte
   autocarro: capacità di carico*/

public class Main {

	public static void main(String[] args) {
		Autoveicolo macchina=new Autoveicolo();
		macchina.setMarca("Hona");
		macchina.setModello("Civic");
		macchina.setNumporte(5);
		macchina.setNumposti(5);
		macchina.setTarga("AX358ST");
		System.out.println(macchina.auto());

	}

}
