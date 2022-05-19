package EsercizioNumeri;

/*esercizio dati due numeri naturali N M (N<M), stampare numeri
pari compresi tra N e M.*/

public class Main {

	public static void main(String[] args) {
	int N=5;
	int M=15;
	
	for(int i=N;i<M;i++) {
		if(i%2==0) {
			System.out.println(+i);
		}
	}
	
}
}
