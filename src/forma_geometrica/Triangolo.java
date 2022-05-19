package forma_geometrica;

public class Triangolo implements FormaGeometrica{
	
	private double latoa;
	private double latob;
	private double latoc;
	
	public Triangolo(double latoa, double latob, double latoc) {
		this.latoa=latoa;
		this.latob=latob;
		this.latoc=latoc;
	}

	public double calcolaPerimetro() {
		double perimetro=this.latoa+this.latob+this.latoc;
		return perimetro;
	}

	public double calcolaArea() {
		double area=(this.latoa+this.latob+this.latoc)/2;
		return area;
	}
	
	

}
