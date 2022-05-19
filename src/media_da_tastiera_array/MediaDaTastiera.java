package media_da_tastiera_array;

import java.util.Scanner;

public class MediaDaTastiera {

	private int index = 5;
	private int[] v;

	public void inserisciArray() {
		Scanner leggi = new Scanner(System.in);
		v = new int[index];
		System.out.println("Inserisci valori nell'array");
		for (int i = 0; i < index; i++) {
			v[i] = leggi.nextInt();
		}
	}

	public double mediaAritmetica() {
		int somma = 0;
		double media = 0;
		for (int i = 0; i < index; i++) {
			somma = somma + v[i];
		}
		return media = somma / index;
	}

}
