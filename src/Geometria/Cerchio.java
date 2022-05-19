package Geometria;
import java.math.*;

public class Cerchio {
	
	private double diametro;
	
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	public double calcolaArea() {
		double raggio=this.diametro/2;
		double area=(raggio*raggio)*Math.PI;
		return area;
	}
	
	public double calcolaPerimetrp() {
		double perimetro=Math.PI*this.diametro;
		return perimetro;
	}

}
