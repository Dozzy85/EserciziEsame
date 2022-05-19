package conto;

public class ContoLoggato extends Conto {
	
	public ContoLoggato(double saldo) throws IllegalArgumentException {
		super(saldo);		
	}

	public void preleva(double importo) throws IllegalArgumentException {
		super.preleva(importo);
		System.out.println("Prelievo effettuato di: "+importo);
	}
	public void deposita(double importo) throws IllegalArgumentException {
		super.deposita(importo);
		System.out.println("Deposito effettuato di: "+importo);
	}

}
