package d10;

public class Car extends Vehicle{
	

	int door;
	
	
//Constructorların geri dönüş tipi olmaz ve sınıf ile aynı isim olmak zorunda
	//Constructor void ve static olamaz
	
	
	/*
	 * public Car () {
	 * 
	 * }
	 */

	public Car(int tire, int door,int velocity) {
	// TODO complete the constructor
	super(tire,velocity);
	this.door = door;
	}
	
	/*
	 * Create a Car object with 4 tires and 5 doors. Using the relevant method,
	 * increase the speed of your car by the last two digits of your student number
	 * and, using the relevant method, get the printout as the following example:
	 * “My car has the velocity 12.”
	 */
	

}
