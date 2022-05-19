package esercizio_interfacce;

/*scrivere un programma per creare un interfaccia (classe). Nell'interfaccia
ci sono due metodi che devono essere implementati. Bisogna implementare questa
interfaccia in un'altra classe MyClass. Verifica ne i numeri sono pari o dispari*/

public class Main {

	public static void main(String[] args) {
		
		ControlloNumeri check=new ControlloNumeri();
		check.setNumero(10);
		check.paridispari();
		check.setNumero(5);
		check.paridispari();

	}

}
