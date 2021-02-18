public class Bicycle extends Cycle
{
	// This programm is an extension of the Cycle's superclass
	// Parameters: String containing the rider's name and the properties inherited from the Cycle
	public Bicycle(int maxSpeed, String riderName)
	{
		super(maxSpeed);
		this.mRiderName = riderName;
	}
	// Bicycle's constructor with parameters to get the maximum speed (int) of the bicycle and the rider's name (String)

	public void journey(String dest, String dep)
	{
		System.out.println("The Bicycle is arriving at " + dest + " from" + dep);
	}
	// Prints the journey: departure + destination

	public void name()
	{
		System.out.println("The rider's name is " + mRiderName);
	}

	private String mRiderName;
	// The name of the rider
}