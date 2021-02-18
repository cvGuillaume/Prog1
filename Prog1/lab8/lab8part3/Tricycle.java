public class Tricycle extends Cycle
{
	// This programm is an extension of the Cycle's superclass
	// Parameters: String containing the rider's name and the properties inherited from the Cycle
	public Tricycle(int maxSpeed, String riderName)
	{
		super(maxSpeed);
		this.mRiderName = riderName;
	}
	// Bicycle's constructor with parameters to get the maximum speed (int) of the tricycle and the rider's name (String)

	public void journey(String dest, String dep)
	{
		System.out.println("Departing:" + dep + "\nDestination: " + dest);
	}
	// Prints the departure and the destination

	public void name()
	{
		System.out.println("The rider's name:" + mRiderName);
	}
	// Prints the rider's name
	private String mRiderName;
}