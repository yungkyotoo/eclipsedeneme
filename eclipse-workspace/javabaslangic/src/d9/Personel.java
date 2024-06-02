package d9;

public abstract class Personel {

	String id;
	String name;
	String surname;
	double salary;
	
	public Personel(String name, String surname) {
		this.name=name;
		this.surname=surname;
			
	}
	
	public abstract void calculateSalary();
}
