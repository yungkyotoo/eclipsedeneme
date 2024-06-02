package d11;

public class Dog extends Hayvan{
	
	public void oyun() {
		System.out.println("Köpekler oyun oynar");
	
	}
	
	@Override
	public void ses() {

		System.out.println("Köpek hav sesi çıkarır");
	}

}
