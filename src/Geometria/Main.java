package Geometria;

/*Creare classe Cerchio ... Diametro, calcolare perimetro ed area
 Stampare attributi di area e perimetro*/

public class Main {

	public static void main(String[] args) {

		Cerchio cerchio1=new Cerchio();
		cerchio1.setDiametro(30);
		System.out.println("Area : "+cerchio1.calcolaArea());
		System.out.println("Perimetro : "+cerchio1.calcolaPerimetrp());

	}

}
