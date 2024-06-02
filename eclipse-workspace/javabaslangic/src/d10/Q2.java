package d10;

public class Q2 {
	public static void main(String[] args) {
		/*
		 * Create a Car object with 4 tires and 5 doors. Using the relevant method,
		 * increase the speed of your car by the last two digits of your student number
		 * and, using the relevant method, get the printout as the following example:
		 * “My car has the velocity 12.”
		 */
		
		
		Car car = new Car(4,5,20);
		
		car.speedUp(12);
		
		System.out.println("My car has the velocity " + car.getVelocity());
		System.out.println("Car tire: "+car.tire);
		System.out.println("Car velocity: "+ car.velocity);
	}

}
