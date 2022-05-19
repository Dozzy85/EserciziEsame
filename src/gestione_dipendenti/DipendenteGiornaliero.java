package gestione_dipendenti;

public class DipendenteGiornaliero extends Dipendenti {
	
	protected double pagaoraria;
	protected double ore;
	protected int giorni;

	public DipendenteGiornaliero(String nome, String indirizzo, String telefono, String cf, double pagaoraria, double ore, int giorni) {
		super(nome, indirizzo, telefono, cf);
		this.pagaoraria=pagaoraria;
		this.ore=ore;
		this.giorni=giorni;
	}
	public double CalcolaStipendio() {
		double stipendio=(this.pagaoraria*this.ore)*this.giorni;
		return stipendio;
	}
	public String stampaDettagli() {
		String dett="Dipendente Giornaliero= -Nome: "+super.nome+" -Indirizzo: "+super.indirizzo+" -Telefono: "+super.telefono+" -Stipendio: "+this.CalcolaStipendio();
		return dett;
	}

}
