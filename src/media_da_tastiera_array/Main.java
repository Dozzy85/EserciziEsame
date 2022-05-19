package media_da_tastiera_array;

/*Implementare metodo di media aritmetica di un array con numeri inseriti da tastiera*/
public class Main {

	public static void main(String[] args) {

		MediaDaTastiera array1 = new MediaDaTastiera();
		array1.inserisciArray();
		System.out.println(array1.mediaAritmetica());
	}

}
