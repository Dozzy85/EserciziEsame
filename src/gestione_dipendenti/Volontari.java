package gestione_dipendenti;

public class Volontari extends Persona {
	
	protected String cf;
	final double stipendio=0;
	
	public Volontari(String nome, String indirizzo, String telefono, String cf) {
		super(nome, indirizzo, telefono);
		this.cf=cf;
	}
	public String stampaDettagli() {
		String dett="Volontario= -Nome: "+super.nome+" -Indirizzo: "+super.indirizzo+" -Telefono: "+super.telefono+" Stipendio: "+this.stipendio;
		return dett;
	}

}
