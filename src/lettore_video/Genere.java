package lettore_video;

public class Genere {

	private  String nome;
	private int numero;
	
	public Genere(String unNome) {
		this.nome=unNome;
		this.numero=0;
	}
	
	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}
	
	public void aggiungi() {
		this.numero++;
	}

	
	
	
}
