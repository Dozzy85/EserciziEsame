package forme_geometriche2;

/*due forme Cerchio e Rettangolo, da entrambe un metodo per ottenere le superfici.
Se le superfici sono equivalenti, restituisce uguale, altrimenti quale è maggiore o minore.*/
public class Main {

	public static void main(String[] args) {
		Cerchio c1 = new Cerchio();
		double areaCerchio = c1.calcoloArea(10);
		Rettangolo r1 = new Rettangolo();
		double areaRettangolo = r1.calcoloArea(20, 5);

		if (areaCerchio == areaRettangolo) {
			System.out.println("Le superfici sono uguali");
		}
		if(areaCerchio>areaRettangolo) {
			System.out.println("La superficie del cercio è maggiore");
		}else {
			System.out.println("La superficie del rettangolo è maggiore");
		}

	}

}
