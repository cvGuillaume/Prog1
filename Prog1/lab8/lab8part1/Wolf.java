public class Wolf extends Carnivore
{
    Wolf(String name, int age)
    {
        super(name, age);
    }

    public void makeNoise()
    {
        System.out.print("Awuuuu");
	}
	
	public Wolf() {
        super();
    }
}