public class Car extends RoadVehicule implements Refuelable
{
	// This programm is an extension of the RoadVehicule's superclass
	// Parameters: The properties inherited from the RoadVehicule, the maximum speed of the car
	public Car(int maxSpeed)
	{
		super(maxSpeed);
	}

	public void journey(String dest, String dep)
	{
		System.out.println("The Car is arriving at " + dest + " from" + dep);
	}
	// Prints the journey: departure + destination

	public void refuel(int litres)
	{
		System.out.println("The car has been filled with: " + litres + "L of gas");
	}
	// Prints how many litres the plane has been filled
}
