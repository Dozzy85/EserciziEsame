package casa;

public class Casa {
	
	boolean isAppartamento;
    
    char letteraInizialeNomeProprietario;
    
    byte nBagni;
    
    short nPiani;
    
    int nStanze;
    
    long nMattoni;
    
    float metriAltezza;
    
    double  metriQuadri;
    
    
    //Metodi Get e Set
    //isAppartamento
    public boolean isAppartamento() {
        return isAppartamento;
    }

    public void setAppartamento(boolean isAppartamento) {
        this.isAppartamento = isAppartamento;
    }

    //letteraInizialeNomeProprietario
    public char getLetteraInizialeNomeProprietario() {
        return letteraInizialeNomeProprietario;
    }

    public void setLetteraInizialeNomeProprietario(char letteraInizialeNomeProprietario) {
        this.letteraInizialeNomeProprietario = letteraInizialeNomeProprietario;
    }

	public byte getnBagni() {
		return nBagni;
	}

	public void setnBagni(byte nBagni) {
		this.nBagni = nBagni;
	}

	public short getnPiani() {
		return nPiani;
	}

	public void setnPiani(short nPiani) {
		this.nPiani = nPiani;
	}

	public int getnStanze() {
		return nStanze;
	}

	public void setnStanze(int nStanze) {
		this.nStanze = nStanze;
	}

	public long getnMattoni() {
		return nMattoni;
	}

	public void setnMattoni(long nMattoni) {
		this.nMattoni = nMattoni;
	}

	public float getMetriAltezza() {
		return metriAltezza;
	}

	public void setMetriAltezza(float metriAltezza) {
		this.metriAltezza = metriAltezza;
	}

	public double getMetriQuadri() {
		return metriQuadri;
	}

	public void setMetriQuadri(double metriQuadri) {
		this.metriQuadri = metriQuadri;
	} 

}
