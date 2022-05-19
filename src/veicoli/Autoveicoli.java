package veicoli;

public class Autoveicoli implements Veicoli {

	private String targa;
	private String modello;
	private int numPosti;

	public Autoveicoli(String targa, String modello, int numPosti) {
		this.targa = targa;
		this.modello = modello;
		this.numPosti = numPosti;
	}

	@Override
	public String toString() {
		String auto = "Targa: " + this.targa + " modello: " + this.modello + " numero posti: " + this.numPosti;
		return auto;
	}

	public String getTarga() {
		return targa;
	}

	public String getModello() {
		return modello;
	}

	public int getNumPosti() {
		return numPosti;
	}

}
