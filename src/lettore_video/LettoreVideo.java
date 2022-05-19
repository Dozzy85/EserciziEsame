package lettore_video;
import lettore_video.*;
import java.util.*;

public class LettoreVideo {
	
	private ArrayList<Video> video;
	private Genere[] generi;
	private int numGeneri;
	private final int MAX_GENERI = 35;
	
	public LettoreVideo(){
		
		video=new ArrayList<>();
		generi=new Genere[MAX_GENERI];
		numGeneri=0;
		
	}
	private int cercaVideo(String untitolo){
		int result=-1;
		for(int i=0;i<video.size();i++){
		if(video.get(i).getTitolo()==untitolo)
		result=i;
		}
		return result;
	}
	
	private int cercaGenere(String unNome){
		int result=-1;
		for(int i=0;i<numGeneri;i++){
		if(generi[i].getNome()==unNome)
		result=i;
		}
		return result;
	}
	
	public void aggGenere(String unNome){
		if(cercaGenere(unNome)!=-1||numGeneri>MAX_GENERI)
			return;
		Genere a=new Genere(unNome);
		generi[numGeneri]=a;
		numGeneri++;
	}
	
	public void aggVideo(String unTitolo, String unGenere){
		if(cercaVideo(unTitolo)!=-1)
			return;
			if(cercaGenere(unGenere)!=-1){
			Video a = new Video(unTitolo, generi[cercaGenere(unGenere)]);
			video.add(a);
			}
			if(cercaGenere(unGenere)==-1&&numGeneri<MAX_GENERI){
			aggGenere(unGenere);
			Video b = new Video(unTitolo,generi[cercaGenere(unGenere)]);
			video.add(b);
			}
	}
	
	public void playVideo(String unTitolo){
		if(cercaVideo(unTitolo)==-1)
			return;
			video.get(cercaVideo(unTitolo)).getGenere().aggiungi();
	}
	
	public int contaVideo(String unGenere){
		if(cercaGenere(unGenere)==-1)
			return -1;
			int num = 0;
			for(int i = 0;i<video.size(); i++){
			if(video.get(i).getGenere().getNome().equals(unGenere))
			num++;
			}
			return num;
	}
	
	public void rimuoviGenere(String rimuoviGenere) {
	if(cercaGenere(rimuoviGenere)==-1)
	return;
		for(int i=video.size()-1;i>-1;i--){
			if(video.get(i).getGenere().getNome().equals(rimuoviGenere))
				video.remove(i);
	}
		generi[cercaGenere(rimuoviGenere)] = generi[numGeneri-1];
		numGeneri--;
	}
	
	public ArrayList<Genere> top(int soglia) {
		ArrayList<Genere>top = new ArrayList<Genere>();
		for(int i = 0;i < numGeneri; i++){
			if(generi[i].getNumero() >= soglia)
				top.add(generi[i]);
		}
		return top;
		}
	}


