package car_sharing;
import car_sharing.*;

public class Automobile {
	
	private String targa;
	private int viaggi;
	private Parcheggio locazione;
	
	public void setParcheggio(Parcheggio nuovo) {
		this.locazione = nuovo;
		this.viaggi++;
	}

	public String getTarga() {
		return targa;
	}

	public int getViaggi() {
		return viaggi;
	}

	public Parcheggio getLocazione() {
		return locazione;
	}
	

	

}
