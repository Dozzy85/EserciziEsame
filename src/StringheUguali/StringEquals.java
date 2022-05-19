package StringheUguali;

public class StringEquals {

	private String testo1;
	private String testo2;
	
	public StringEquals(String test1, String test2) {
		this.testo1=test1;
		this.testo2=test2;
	}
	public boolean comparazione() {
		return this.testo1.equals(this.testo2);
	}
}
