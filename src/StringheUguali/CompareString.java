package StringheUguali;

public class CompareString {
	
	private String stringa1;
	private String stringa2;

	
	public CompareString (String stringa1, String stringa2) {
		
		this.stringa1=stringa1;
		this.stringa2=stringa2;
		
	}
	
	public void compare() {
		if((this.stringa1.compareTo(stringa2)==0)) {
			System.out.println("Stringhe uguali");
		}else {
			System.out.println("Stringhe diverse");
		}
	}
	

	public static void main(String[] args) {
		
		CompareString comparazione=new CompareString("Ciao", "Ciao");
		comparazione.compare();	
		
	}
}