package media_ponderata;

public class ArrayMedia {

	public static void main(String[] args) {
		
		ArrayMedia am=new ArrayMedia();
		
		//calcolo della media aritmetica
		double[] mediaAritArr = {1, 2, 2, 4, 5, 3, 3, 3};
		double mediaArit = am.mediaAritmeica(mediaAritArr);
		System.out.println("media aritmetica: "+ mediaArit);
		
		//calcolo della media ponederata
		double[] valori = {7, 8, 9, 10, 11, 12, 13, 14};
		double[] pesi = {8, 12, 15, 50, 100, 10, 9, 6};
		double mediaPonderata = am.mediaPonderata(valori, pesi);
		System.out.println("media ponderata: "+ mediaPonderata);

	}

	

	private double mediaPonderata(double[] valori, double[] pesi) {
		double somma=0;
		for(int i=0;i<valori.length;i++) {
			double temp=valori[i]*pesi[i];
			somma=somma+temp;
		}
		double somma2=0;
		for(int j=0;j<pesi.length;j++) {
			somma2=somma2+pesi[j];
		}
		double media=somma/somma2;
		return media;
	}


	private double mediaAritmeica(double[] mediaAritArr) {
		int cont=0;
		double somma=0;
		for(int i=0;i<mediaAritArr.length;i++) {
			somma=somma+mediaAritArr[i];
			cont++;
		}
		return somma/cont;
	}

}
