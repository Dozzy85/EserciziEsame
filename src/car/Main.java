package car;

/*Progettare e realizzare una classe Car(automobile) con le propriet? seguenti.
Un?automobile ha una determinata resa del carburante (misurata in miglia/galloni
o in litri/chilometri: scegliete il sistema che preferite) e una certa quantit?
di carburante nel serbatoio. La resa ? specificata dal costruttore e il livello
iniziale del carburante ? a zero. Fornire questi metodi: un metodo drive per
simulare il percorso di un?automobile per una certa distanza, riducendo il
livello di carburante nel serbatoio; un metodo getGas, per ispezionare il
livello corrente del carburante; un metodo addGas per far rifornimento.
Consigli:
S?invita a porre particolare attenzione al metodo drive(double km), che calcola
il livello di carburante dopo un certo percorso.*/

public class Main {

	public static void main(String[] args) {
		
		Car auto=new Car(1);
		System.out.println(auto.getGas());
		auto.addGas(10);
		System.out.println(auto.getGas());
		auto.drive(2, 5);
		System.out.println(auto.getGas());

	}

}
