package IO_File;
import java.io.*;

/*esercizio costruire un'app che scrive e rilegge dei dati su un file
usanto il bytestream*/

public class EsercizioFile {

	public static void main(String[] args) throws IOException {
		
		//Viariabile string con il contenuto del file
		String data="Questo è quello che svrive nel file";
		
		try {
			OutputStream scrivi=new FileOutputStream("miofile.txt");
			//Converto la stringa inizializzata prima in byte
			byte[] databytes=data.getBytes();
			//Scrivo ora sul file
			scrivi.write(databytes);
			//Stampo a schermo l'avvenuta scrittura
			System.out.println("Scrittura su file riuscita");
			//Chiudo il file in scrittura		
			scrivi.close();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
		//Creo un array di byte per dove inserirò quello che legge dal file
		byte[] array=new byte[100];
		try {
			InputStream leggi=new FileInputStream("miofile.txt");
			//Controllo quanty byte ci sono nel file
			System.out.println("Nel file ci sono: "+leggi.available()+" byte");
			//leggo dal file
			leggi.read(array);
			//Converto l'array di byte in stringa
			String data1=new String(array);
			//Stampo a video quello letto dal file
			System.out.println("Nel file c'è scritto: "+data1);
			//Chiudo il file in lettura
			leggi.close();
		}
		catch (Exception e) {
			e.getStackTrace();
		}

	}

}
