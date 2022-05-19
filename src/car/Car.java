package car;

public class Car {

	private double serbatoio;
	private double km;
	
	public Car(double km) {
		this.km=km;
		this.serbatoio=0;
	}
	
	public void addGas(double rifornimento) {
		this.serbatoio=this.serbatoio+rifornimento;
	}
	
	public double getGas() {
		return this.serbatoio;
	}
	
	public void drive(double litri, double km) {
		this.serbatoio=this.serbatoio-(litri/km);
	}
}
