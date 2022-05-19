package casa;
import java.util.*;

/*Esercio: partendo da questo codice, aggiungere un metodo per 
 * ogni attributo che legge un valore da tastiera 
 * (Tipo numero di bagni o piani) e lo salva nell'attributo*/

public class Main {

	public static void main(String[] args) {
	
		Casa casa1=new Casa();
		casa1.setAppartamento(true);
		casa1.setLetteraInizialeNomeProprietario('A');
		casa1.setMetriAltezza(100);
		casa1.setMetriQuadri(190);
		casa1.setnBagni((byte) 1);
		casa1.setnMattoni(1000);
		casa1.setnPiani((short) 3);
		casa1.setnStanze(5);
		
		ArrayList dettagliCasa=new ArrayList<>();
		dettagliCasa.add(casa1.nStanze);
		
		for(int i=0;i<dettagliCasa.size();i++) {
			System.out.println(dettagliCasa.get(i));
		}

	}

}
