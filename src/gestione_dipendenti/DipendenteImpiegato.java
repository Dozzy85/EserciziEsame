package gestione_dipendenti;

public class DipendenteImpiegato extends Dipendenti {
	
	private double mensile;
	private double bonus;

	public DipendenteImpiegato(String nome, String indirizzo, String telefono, String cf, double mensile, double bonus) {
		super(nome, indirizzo, telefono, cf);
		this.mensile=mensile;
		this.bonus=bonus;
	}
	public double CalcolaStipendio() {
		double stipendio=this.bonus+this.mensile;
		return stipendio;
	}
	public String stampaDettagli() {
		String dett="Dipendente Impiegato= -Nome: "+super.nome+" -Indirizzo: "+super.indirizzo+" -Telefono: "+super.telefono+" -Stipendio: "+this.CalcolaStipendio();
		return dett;
	}
	
	
}
