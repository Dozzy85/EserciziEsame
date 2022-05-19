package distributore_benzina;
import car.*;

public class DistributoreBenzina {
	
	private double deposito;
	private double euroPerLitro;
		
	public DistributoreBenzina(double unPrezzoPerLitro) {
		this.euroPerLitro=unPrezzoPerLitro;
		this.deposito=0;
	}
	
	public void	rifornisci(double unaQuantita) {
		this.deposito=this.deposito+unaQuantita;
	}
	
	public void vendi(double euro, Car unaAutomobile) {
		double litriVenduti = euro/euroPerLitro;
		deposito = deposito - litriVenduti;
		unaAutomobile.addGas(litriVenduti);
	}
	
	public void aggiorna(double	unPrezzoPerLitro) {
		this.euroPerLitro=unPrezzoPerLitro;
	}
	
	public double serbatoio() {
		return this.deposito;
	}

}
