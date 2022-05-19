package car_sharing;
import car_sharing.*;
import java.util.*;

public class CarSharing {
	
	private ArrayList<Parcheggio> parcheggi;
	private ArrayList<Automobile> automobili;
	
	public CarSharing(){
		parcheggi=new ArrayList<Parcheggio>();
		automobili=new ArrayList<Automobile>();
	}
	
	public int cercaAuto(String unaTarga) {
		int result=-1;
		for(int i=0;i<automobili.size();i++) {
			if(automobili.get(i).getTarga().equals(unaTarga)) 
				result=i;
		}
		return result;
	}
	
	public int cercaParcheggio(String unNome) {
		int result=-1;
		for(int i=0;i<parcheggi.size();i++) {
			if(parcheggi.get(i).getNome().equals(unNome))
				result=i;
		}
		return result;
	}
	
	public void aggiungiParcheggio(String unNome) {
		if(cercaParcheggio(unNome)!=-1)
			return;
		Parcheggio a=new Parcheggio(unNome);
		parcheggi.add(a);
	}
	
	public void aggiungiAutomobile(String unaTarga, int unViaggio, Parcheggio unaLocazione) {
		if(cercaAuto(unaTarga)!=-1)
			return;
		Automobile b=new Automobile();
		automobili.add(b);
	}
	
	public void transito(String unaTarga, String parcheggioArrivo){
		if(cercaAuto(unaTarga)==-1||cercaParcheggio(parcheggioArrivo)==-1)
			return;
			automobili.get(cercaAuto(unaTarga)).setParcheggio(parcheggi.get(cercaParcheggio(parcheggioArrivo)));
	}
	
	public int contaAutomobili(String unaTarga, Parcheggio unaLocazione) {
		if(cercaAuto(unaTarga)!=-1)
			return -1;
		int tot=0;
		for(int i=0;i<automobili.size();i++) {
			tot++;
		}
		return tot;
	}
	
	public void rimuoviAutomobili(int numeroViaggi) {
		for(int i=0;i<automobili.size();i++) {
			if(automobili.get(i).getViaggi()>=numeroViaggi)
				automobili.remove(i);
		}
		
	}

}
