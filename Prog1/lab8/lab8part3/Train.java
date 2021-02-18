public class Train extends Transport implements Refuelable
{
	// This programm is an extension of the Transport's superclass
	// Parameters: The properties inherited from the transport, the maximum speed of the Train
	public Train(int maxSpeed)
	{
		super(maxSpeed);
	}

	public void journey(String dest, String dep)
	{
		System.out.println("The train is arriving at " + dest + " from" + dep);
	}
	// Prints the journey: departure + destination with the License plate number of the plane
	
	public void refuel(int litres)
	{
		System.out.println("The JetPlane has been filled of " + litres + "L of gas");
	}
	// Prints how many litres the plane has been filled
}
