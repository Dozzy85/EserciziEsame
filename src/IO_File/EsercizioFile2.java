package IO_File;
import java.io.*;
public class EsercizioFile2 {

	public static void main(String[] args) throws IOException{
		
		String testo="testo da scrivere nel file";
		
		try {
			OutputStream scrivi=new FileOutputStream("esempio.txt");
			byte[] bytetesto=testo.getBytes();
			scrivi.write(bytetesto);
			System.out.println("Scrittura avvenuta");
			scrivi.close();			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		byte[] array=new byte[100];
		
		try {
			InputStream leggi=new FileInputStream("esempio.txt");
			System.out.println("Nel file ci sono "+leggi.available()+" byte");
			leggi.read(array);
			String testoletto=new String(array);
			System.out.println("nel file è scritto "+testoletto);
			leggi.close();			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
