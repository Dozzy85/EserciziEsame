package forme_geometriche2;

import java.math.*;

public class Cerchio {

	public double calcoloArea(double unDiametro) {
		double raggio = unDiametro / 2;
		double area = (raggio * raggio) * Math.PI;
		return area;
	}

}
