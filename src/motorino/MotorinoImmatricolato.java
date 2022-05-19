package motorino;

public class MotorinoImmatricolato extends Motorino{
	
	private double maxVelocita;
	private String targa;
	
	public MotorinoImmatricolato(String unColore, double unaVelocita, String unaMarcaModello, double unaMaxVelocita, String unaTarga) {
		super(unColore, unaVelocita, unaMarcaModello);
		this.maxVelocita=unaMaxVelocita;
		this.targa=unaTarga;
	}

	public double getMaxVelocita() {
		return maxVelocita;
	}

	@Override
	public void accellera(double unaVelocita) {
		double temp=super.getVelocita()+unaVelocita;
		if(temp<maxVelocita) {
			super.setVelocita(temp);
		}else {
			super.setVelocita(maxVelocita);
		}
	}
	

}
