package forma_geometrica;

/*IMPLEMENTARE L'INTERFACCIA CON UNA CLASSE TRIANGOLO CHE ABBIA 3 LATI E IMPLEMENTI I METODI*/

public class Main {
	
	public static void main(String[] args) {
		
		Triangolo equilatero=new Triangolo(10, 5, 7);
		System.out.println("Perimetro:" +equilatero.calcolaPerimetro());
		System.out.println("Area:" +equilatero.calcolaArea());
	}

}
