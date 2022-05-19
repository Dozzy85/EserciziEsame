package libro;

public class Libro {
	
	private String titolo;
	private String autore;
	private int copie;
	
	public Libro(String titolo, String autore, int copie) {
		
		this.titolo=titolo;
		this.autore=autore;
		this.copie=copie;
		
	}
	
	public String copieDisponibili(String titolo) {
		if(this.titolo==titolo) {
			String risultato="Copie Disponibili: "+this.copie+ " del libro "+this.titolo;
			return risultato;
		}else {
			String risultato="Titolo non trovato";
			return risultato;
		}
	}
	
	public String dettagli(String titolo) {
		String dett="Titolo: "+this.titolo+" autore: "+this.autore+" copie: "+this.copie;
		return dett;
	}

}
