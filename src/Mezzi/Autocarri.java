package Mezzi;

public class Autocarri {
	
	private String targa;
	private String modello;
	private int numPosti;
	protected int maxCarico;
	
	public Autocarri(String targa, String modello, int numPosti, int maxCarico) {
		this.targa=targa;
		this.modello=modello;
		this.numPosti=numPosti;
		this.maxCarico=maxCarico;
	}
	
	public void stampa() {
		System.out.println("La targa è: "+targa+" il modello è: "+modello+" il numero dei posti è: "+numPosti+" il max Carico è: "+maxCarico);
	}
	

}
