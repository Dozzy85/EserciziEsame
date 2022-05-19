package telefono;

public class Cellulare {
	
	private double carica;
	private int numChiamate=0;
	
	public Cellulare(double carica, int numChiamate) {
		this.carica=carica;
		this.numChiamate=numChiamate;
	}
	public void ricarica(double unaRicarica) {
		this.carica=this.carica+unaRicarica;
	}
	public void chiama(double minutiDurata) {
		this.numChiamate++;
		this.carica=this.carica-(minutiDurata*0.20);
	}
	public double numero404() {
		return this.carica;
	}
	public int getNumeroChiamate() {
		return this.numChiamate;
	}
	public void azzeraChiamate() {
		this.numChiamate=0;
	}

}
