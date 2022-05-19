package gestione_dipendenti;

public class Dipendenti extends Persona{
	
	protected String cf;
		
	public Dipendenti(String nome, String indirizzo, String telefono, String cf) {
		super(nome, indirizzo, telefono);
		this.cf=cf;
	}
	
	/*public double CalcolaStipendio() {
		double stipendio=(this.pagaoraria*this.ore)*this.giorni;
		return stipendio;
	}*/
	public String stampaDettagli() {
		String dett="Dipendente= -Nome: "+this.nome+" -Indirizzo: "+this.indirizzo+" -Telefono: "+this.telefono;
		return dett;
	}	
	

}
