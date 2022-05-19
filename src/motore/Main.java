package motore;

/*Creare una classe Motore con attributi: cilindrata cavalli cilindri
  Metodi: uno che dice se Diesel o Benzina, un altro ritorna il numero massimo di giri, 
  ed un ultimo che calcola la potenza motore
  Implementare altra classe che MotoreABenzina che estende Motore.*/

public class Main {

	public static void main(String[] args) {
		
		MotoreBenzina motben=new MotoreBenzina();
		motben.setAlimentazione("Benzina");
		motben.setCavalli(55);
		motben.setCilindrata(1600);
		motben.setCilindri(10);
		System.out.println(motben.buildMotore());

	}

}
