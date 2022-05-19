package motorino;

public class Motorino {
	
	private String colore;
	private double velocita;
	private String marcamodello;
	private boolean antifurto;
	
	public Motorino(String unColore, double unaVelocita, String unaMarcaModello) {
		this.colore=unColore;
		this.velocita=unaVelocita;
		this.marcamodello=unaMarcaModello;
		this.antifurto=false;
	}

	public double getVelocita() {
		return velocita;
	}
	
	public void accellera(double unaVelocita) {
		if(antifurto==false) {
			this.velocita=this.velocita+unaVelocita;
		}
	}
	
	public void inserisciAntifurto() {
		this.antifurto=true;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getMarcamodello() {
		return marcamodello;
	}

	public void setMarcamodello(String marcamodello) {
		this.marcamodello = marcamodello;
	}

	public boolean isAntifurto() {
		return antifurto;
	}

	public void setVelocita(double velocita) {
		this.velocita = velocita;
	}

	
}
