package autorimessa;
import java.util.*;

public class Autorimessa {
	
	ArrayList<String> box;
	
	public Autorimessa() {
		box=new ArrayList<String>();
	}
	
	public void parcheggia(String unaTarga) {
		if(cercaTarga(unaTarga)!=-1) 
			return;
			box.add(unaTarga);
	}
	
	public void rimuovi(String unaTarga) {
		if(cercaTarga(unaTarga)==-1) 
			return;
			box.remove(cercaTarga(unaTarga));
	}
	
	public int numeroAuto() {
		return box.size();
	}
	
	private int cercaTarga(String unaTarga) {
		int ris=-1;
		for(int i=0;i<box.size();i++) {
			if(box.get(i).equals(unaTarga)) {
				ris=i;
			}
		}
		return ris;
	}

}
