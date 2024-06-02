package d10;

public class Vehicle {

	int tire;
	double velocity;

	public Vehicle(int tire, int velocity) {
		this.tire = tire;
		this.velocity =10+velocity;
		
	}

	public double speedUp(double speed) {
		return velocity += speed;
	}

	public double getVelocity() {
		
		return velocity;
	}

}
