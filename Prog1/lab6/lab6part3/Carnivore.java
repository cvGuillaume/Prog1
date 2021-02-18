public abstract class Carnivore extends Animal
{
    Carnivore(String name, int age)
    {
        super(name, age);
    }

    public void eat(Food food) throws Exception
    {
        if (food instanceof Meat)
        {
			System.out.println(this.getName() + " is eating " + food.getFoodName());
        }
        else if (food instanceof Plant)
        {
			throw new Exception("Plant was given to Carnivore " + this.getName());
		}
	}
}