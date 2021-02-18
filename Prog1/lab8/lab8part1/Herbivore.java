public abstract class Herbivore extends Animal
{
    Herbivore(String name, int age)
    {
        super(name, age);
    }

    public void eat(Food food) throws Exception
    {
        if (food instanceof Plant)
        {
			System.out.println(this.getName() + " is eating " + food.getFoodName());
        }
        else if (food instanceof Meat)
        {
			throw new Exception("Meat was given to Herbivore " + this.getName());
		}
	}
}