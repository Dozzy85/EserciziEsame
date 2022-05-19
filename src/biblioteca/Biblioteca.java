package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	
	ArrayList<Libro> libri;
	ArrayList<Utente> utenti;
	
	public Biblioteca() {
		libri=new ArrayList<>();
		utenti=new ArrayList<>();
	}
	
	private int cercaCodice(int unCodice){
	int result=-1;
	for(int i=0;i<libri.size();i++){
	if(libri.get(i).getCodice()==unCodice)
	result=i;
	}
	return result;
	}
	
	private int cercaUtente(String unCognome){
	int result=-1;
	for(int i=0;i<utenti.size();i++){
	if(utenti.get(i).getCognome().equals(unCognome))
	result=i;
	}
	return result;
	}
	public void aggiungiUtente(String unNome, String unCognome){
	if(cercaUtente(unCognome)!=-1)
	return;
	Utente a = new Utente(unNome, unCognome);
	utenti.add(a);
	}
	
	public void aggiungiLibro(int unCodice, String unTitolo){
		if(cercaCodice(unCodice)!=-1)
		return;
		Libro b = new Libro(unCodice, unTitolo);
		libri.add(b);
		}
	
	public void creaPrestito(int unCodice, String unCognome){
	libri.get(cercaCodice(unCodice)).setUtenteAssegnato(utenti.get(cercaUtente(unCognome)));
	}
	
	public String toString(){
	String r = "";
	r = "Libri="+libri+" Utenti="+utenti;
	return r;
	}

}
