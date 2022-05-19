package veicoli;

public class Autocarri extends Autoveicoli {

	private int maxCarico;

	public Autocarri(String targa, String modello, int numPosti, int maxCarico) {
		super(targa, modello, numPosti);
		this.maxCarico = maxCarico;
	}

	@Override
	public String toString() {
		String auto = "Targa: " + super.getTarga() + " modello: " + super.getModello() + " numero posti: " + super.getNumPosti()+" Max Carico: "+this.maxCarico;
		return auto;
	}

}
