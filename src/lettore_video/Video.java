package lettore_video;
import lettore_video.*;

public class Video {
	
	private String titolo;
	private Genere genere;
	
	public Video(String untitolo, Genere ungenere) {
		this.titolo=untitolo;
		this.genere=ungenere;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public Genere getGenere() {
		return genere;
	}
	

}
