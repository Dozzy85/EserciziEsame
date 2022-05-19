package media_array;

/*sercizio: implementare il metodo mediaArray, che prende in input un array e ne restituisce la media dei suoi elementi 
 public class TestArray*/
public class Main {

	public static void main(String[] args) {

		//creazione di un'istanza della classe TestArray
        TestArray testArray = new TestArray();
        //creazione di un array di interi
        int arrayInt[] = {1, 2, 3, 4};
        System.out.println("Media : "+testArray.mediaArray(arrayInt));
		

	}

}
