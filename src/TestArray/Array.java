package TestArray;

/*esercizio scrivere un metodo che dato un array di int A contenente almeno 2
int V e int K>0 elementi restituisce True se in A esistono almeno K coppie
di interi la cui somma è maggiore*/

public class Array {

	public static void main(String[] args) {
		int[] A;
		A=new int[]{1,2,0,0,0};
		int[] V;
		V=new int[]{10,2,0,0,0};
		int somma=0;
		
		for(int i=0;i<A.length;i++) {
			somma+=A[i];
		}
		for(int j=0;j<V.length;j++) {
			if(somma>V[j]) {
				System.out.println("trovata una coppia di elementi maggiore");
			}else {
				System.out.println("Non è stata trovata una coppia di elementi maggiore");
			}
		}
		

	}

}
