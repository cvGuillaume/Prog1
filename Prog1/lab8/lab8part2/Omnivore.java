public abstract class Omnivore extends Animal
{
    Omnivore(String name, int age)
    {
        super(name, age);
    }
    public void eat(Food food) throws Exception
    {
		System.out.println(this.getName() + " is eating " + food.getFoodName());
	}
}