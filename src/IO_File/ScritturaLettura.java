package IO_File;

import java.io.*;

public class ScritturaLettura {

	public static void main(String[] args) throws IOException {
		
		String path="C:\\Users\\Dell\\eclipse-workspace\\EserciziEsame\\testo.txt";
		
		try {
			File file=new File(path);
			if(file.exists()) {
				System.out.println("Il file "+path+" esiste");
			}else if(file.createNewFile()) {
				System.out.println("Il file "+path+" è stato creato");
			}else {
				System.out.println("Il file "+path+" non può essere creato");
			}
		}catch(IOException e) {
			e.getStackTrace();
		}
		try {
			FileWriter scrivi=new FileWriter(path);
			scrivi.write("Questo è il testo scritto nel file");
			scrivi.close();
		}catch(IOException e) {
			e.getStackTrace();
		}
		char[] lettura=new char[100];
		int size=0;
		try {
			FileReader leggi=new FileReader(path);
			size=leggi.read(lettura);
			System.out.println("I caratteri presenti nel file sono: "+size);
			System.out.print("Il contenuto del file è: ");
			for(int i=0;i<size;i++) {
				System.out.print(lettura[i]);
			}
			leggi.close();
		}catch(IOException e){
			e.getStackTrace();
		}
		
	}

}
