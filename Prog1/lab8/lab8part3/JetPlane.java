public class JetPlane extends Transport implements Refuelable
{
	// This programm is an extension of the Transport's superclass
	// Parameters: The properties inherited from the transport, the maximum speed of the JetPlain
	public JetPlane(int maxSpeed)
	{
		super(maxSpeed);
	}

	public void journey(String dest, String dep)
	{
		System.out.println("The JetPlane is landing in " + dest + " from" + dep);
	}
	// Prints the journey: departure + destination

	public void refuel(int litres)
	{
		System.out.println("The JetPlane has been filled of " + litres + "L of gas");
	}
	// Prints how many litres the plane has been filled
}
