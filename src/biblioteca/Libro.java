package biblioteca;

public class Libro  {
	
	private int codice;
	private String titolo;
	private Utente utenteAssegnato;
	
	public Libro(int unCodice, String unTitolo) {
		this.codice=unCodice;
		this.titolo=unTitolo;
		this.utenteAssegnato=null;
	}

	public Utente getUtenteAssegnato() {
		return utenteAssegnato;
	}

	public void setUtenteAssegnato(Utente utenteAssegnato) {
		this.utenteAssegnato = utenteAssegnato;
	}

	public int getCodice() {
		return codice;
	}

	public String getTitolo() {
		return titolo;
	}

	public String toString() {
		String dettaglio="Codice: "+this.codice+" Titolo: "+" Utente: "+this.utenteAssegnato;
		return dettaglio;
	}
	
}
