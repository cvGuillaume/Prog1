public abstract class Transport
{
	// This program is the abstract superclass of all Transport vehicule classes
	// Every transport object has a maximum speed and at least one method ('journey') that defines the departure and the arrival
	public Transport(int maxSpeed)
	{
		this.mMaxSpeed = maxSpeed;
	}
	// Transport class constructor, it defines the Maximum speed of the vehicule

	public abstract void journey(String dest, String dep);
	// Defines the journey with the destination and departure
	private int mMaxSpeed;
}
