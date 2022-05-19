package motore;

public class Motore {

	private int cavalli;
	private int cilindri;
	private int cilindrata;
	
	public int getCavalli() {
		return cavalli;
	}
	public void setCavalli(int cavalli) {
		this.cavalli = cavalli;
	}
	public int getCilindri() {
		return cilindri;
	}
	public void setCilindri(int cilindri) {
		this.cilindri = cilindri;
	}
	public int getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	public String buildMotore() {
		String motore="Cavalli; "+this.cavalli+" Cilindri: "+this.cilindri+" Cilindrata: "+this.cilindrata;
		return motore;
	}
	
}
