package arrayList;

import java.util.ArrayList;

public class cancArrayList {
	
	private ArrayList<Integer> lista;
	
	public cancArrayList() {
		lista=new ArrayList<Integer>();
	}
	public void inserisci(int n) {
		lista.add(n);
	}
	public void cancLista() {
		int dim=lista.size();
		for(int i=0;i<dim;i++) {
			for(int j=0;j<dim;j++) {
				if(lista.get(i)%2==0) {
					lista.remove(i);
					dim=dim-1;
				}
			}
		}
	}
	
	public String stampa() { 
		return lista.toString();
	}

}
