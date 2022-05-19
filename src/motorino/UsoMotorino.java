package motorino;

public class UsoMotorino {

	public static void main(String[] args) {
		
		Motorino moto1=new Motorino("Grigio metallizzato", 40.5, "Piaggio Liberty");
		moto1.accellera(20);
		System.out.println("Velocità Motorino: "+moto1.getVelocita());
		
		MotorinoImmatricolato moto2=new MotorinoImmatricolato("Rosso", 30.5, "Aprilia Scarabeo", 60, "CV1234");
		moto2.accellera(15);
		System.out.println("Velocità Motorino Immatricolato: "+moto2.getVelocita());
	}

}
