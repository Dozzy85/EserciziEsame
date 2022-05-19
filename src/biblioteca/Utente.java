package biblioteca;

public class Utente {
	
	private String nome;
	private String cognome;
	
	public Utente(String unNome, String unCognome) {
		this.nome=unNome;
		this.cognome=unCognome;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}
	
	public String toString() {
		String dettagli="Nome: "+this.nome+" Cognome: "+this.cognome;
		return dettagli;
	}

}
