package persona;

public class Uomo extends Persona {
	
	String sesso;
	
	public Uomo(String nome, String cognome, int et�, String sesso) {
		super(nome, cognome, et�);
		this.sesso=sesso;
	}	
	
	public void dettagli() {
		System.out.println("Il nome �: "+super.getNome()+" il cognome �: "+super.getCognome()+" anni: "+super.getEt�()+" Sesso: "+this.sesso);
	}
	

}
