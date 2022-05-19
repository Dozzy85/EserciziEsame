package esercizio_interfacce;

public class ControlloNumeri implements PariDispari {
	
	private double numero;
	
	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	@Override
	public void paridispari() {
		if(this.numero%2==0) {
			System.out.println("Numero: "+this.numero+" è pari");
		}else {
			System.out.println("Numero: "+this.numero+" è dispari");
		}
		
	}

}
