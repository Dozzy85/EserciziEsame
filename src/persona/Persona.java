package persona;

public class Persona {

	private String nome;
	private String cognome;
	private int et�;
	
	public Persona(String nome, String cognome, int et�) {
		this.nome=nome;
		this.cognome=cognome;
		this.et�=et�;
	}
	public void dettagli() {
		System.out.println("Il nome �: "+this.nome+" il cognome �: "+this.cognome+" anni: "+this.et�);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getEt�() {
		return et�;
	}
	public void setEt�(int et�) {
		this.et� = et�;
	}
	
	
}
