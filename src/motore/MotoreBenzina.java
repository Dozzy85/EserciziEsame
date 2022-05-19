package motore;

public class MotoreBenzina extends Motore {
	
	private String alimentazione;

	public String getAlimentazione() {
		return alimentazione;
	}

	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}

	@Override
	public String buildMotore() {
		String motore="Cavalli; "+super.getCavalli()+" Cilindri: "+super.getCilindri()+" Cilindrata: "+super.getCilindrata()+" Alimentazione: "+this.alimentazione;
		return motore;
	}

}
