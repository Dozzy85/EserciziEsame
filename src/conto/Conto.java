package conto;

/*Sia data la seguente classe che rappresenta un 
 * conto bancario  implementare una sottoclasse per 
 * loggare le operazioni
 */

public class Conto {
	
	private double saldo;

	public Conto(double saldo) throws IllegalArgumentException
	{
	if (saldo < 0)
	throw new IllegalArgumentException("saldo negativo");
	this.saldo = saldo;
	}

	public void preleva (double importo) throws IllegalArgumentException
	{
		if (saldo <= 0)
		throw new IllegalArgumentException("importo non positivo");

		if (saldo < importo)
		throw new IllegalArgumentException("importo > saldo");
		saldo -= importo;
	}

		public void deposita(double importo) throws IllegalArgumentException
		{
		if (importo <= 0)
		throw new IllegalArgumentException("importo non positivo");
		saldo += importo;
		}

}
