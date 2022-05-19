package Prodotto;

public class ProdottoNumeri {
	
	private int num1;
	private int num2;
	
	public ProdottoNumeri(int numero1, int numero2) {
		this.num1=numero1;
		this.num2=numero2;
	}
	
	public int sommatore() {
		return num1+num2;
	}

}
