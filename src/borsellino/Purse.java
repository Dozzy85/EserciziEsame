package borsellino;

import java.util.*;

public class Purse {
	
	private ArrayList<String> borsellino;
	
	public Purse() {
		borsellino=new ArrayList<String>();
	}
	
	public void addCoin(String coinName) {
		borsellino.add(coinName);
	}
	
	public String stampa() {
		return borsellino.toString();
	}

}
