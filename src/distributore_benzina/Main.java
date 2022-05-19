package distributore_benzina;

import car.Car;

/*Esercizio pagina 14
Progettare una classe di nome DistributoreBenzina, per rappresentare un
distributore di carburante per automobili. Tale classe prevede due variabili
d'istanza. La prima chiamata deposito, di tipo double, e contiene il
quantitativo di benzina disponibile al distributore. La seconda, chiamata
euroPerLitro, di tipo double, rappresenta il prezzo della benzina, espresso in
euro per litro.
La classe deve implementare un costruttore public DistributoreBenzina(double
unPrezzoPerLitro), che prende come parametro esplicito il prezzo in euro per un
litro di benzina. La quantita' iniziale di benzina disponibile e' zero. La
classe deve inoltre implementare i seguenti metodi: public void
rifornisci(double unaQuantita), che rifornisce il distributore di benzina.
public void vendi(double euro, Car unaAutomobile) che vende una quantita' di
benzina corrispondente all'ammontare di euro pagato che va a rifornisce
l'automobile passata come parametro esplicito. public void aggiorna(double
unPrezzoPerLitro), che aggiorna il prezzo della benzina.
Consigli:
Si noti che nel metodo vendi(double euro, Car unAutomobile) il secondo parametro
esplicito unAutomobile è un oggetto della classe Car dell’esercizio 3.3 che deve
essere costruito con il costruttore della classe Car, di conseguenza, si possono
sfruttare i metodi della classe Car.
Nel Tester create varie automobili e un distributore. Fate compiere alcuni
"viaggi" alle automobili, e rifornitele di benzina in modo appropriato. Inoltre,
rifornite la pompa di benzina in caso di necessità.*/

public class Main {

	public static void main(String[] args) {
		
		DistributoreBenzina agip=new DistributoreBenzina(1.25);
		System.out.println(agip.serbatoio());
		agip.rifornisci(50);
		System.out.println(agip.serbatoio());
		Car opel=new Car(10);
		agip.vendi(5, opel);
		System.out.println(agip.serbatoio());
		System.out.println(opel.getGas());

	}

}
