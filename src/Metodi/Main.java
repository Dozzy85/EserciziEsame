package Metodi;

/*scrivere un programma per creare una classe di istanze. Questa classe sono presenti
attributi tipo , numero, area, servizi. Bisogna generare delle classi funzioni
che sono per settare e visualizzare i dati*/

public class Main {

	public static void main(String[] args) {
		
		Istanze istance=new Istanze();
		
		istance.setArea(10);
		istance.setNum(8);
		istance.setServizi("Prova");
		
		System.out.println("Area: "+istance.getArea());
		System.out.println("Numero: "+istance.getNum());
		System.out.println("Servizi: "+istance.getServizi());

	}

}
