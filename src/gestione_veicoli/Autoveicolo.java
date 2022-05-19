package gestione_veicoli;

public class Autoveicolo {

	private String targa;
	private String modello;
	private int numposti;
	private String marca;
	private int numporte;
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public void setNumposti(int numposti) {
		this.numposti = numposti;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setNumporte(int numporte) {
		this.numporte = numporte;
	}
	
	public String auto() {
		String veicolo="Targa: "+this.targa+" Modello: "+this.modello+" Numero Posti: "+this.numposti+" Marca: "+this.marca+" Numero Porte: "+this.numporte;
		return veicolo;
	}
	
}
