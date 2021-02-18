public abstract class Animal
{

	Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	abstract void makeNoise();
	public abstract void eat(Food food) throws Exception;
	private String name;
	private int age;
}