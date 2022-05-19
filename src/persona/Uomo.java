package persona;

public class Uomo extends Persona {
	
	String sesso;
	
	public Uomo(String nome, String cognome, int età, String sesso) {
		super(nome, cognome, età);
		this.sesso=sesso;
	}	
	
	public void dettagli() {
		System.out.println("Il nome è: "+super.getNome()+" il cognome è: "+super.getCognome()+" anni: "+super.getEtà()+" Sesso: "+this.sesso);
	}
	

}
