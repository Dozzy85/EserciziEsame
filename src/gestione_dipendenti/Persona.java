package gestione_dipendenti;

public class Persona {
	
	protected String nome;
	protected String indirizzo;
	protected String telefono;
	
	public Persona(String nome, String indirizzo, String telefono) {
		this.nome=nome;
		this.indirizzo=indirizzo;
		this.telefono=telefono;
	}
	public String stampaDettagli() {
		String dett="-Nome: "+this.nome+" -Indirizzo: "+this.indirizzo+" -Telefono: "+this.telefono;
		return dett;
	}

}
