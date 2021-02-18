public abstract class Animal implements Comparable<Animal>
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

    public void eat(Food food, int times) throws Exception {
        for (int i = 0; i < times; i++) {
            this.eat(food);
        }
	}
	
    public Animal() {
        this("newborn", 0);
	}
	
    public int compareTo(Animal compareToAnimal) {
        return this.getAge()-compareToAnimal.getAge();
	}
	
	abstract void makeNoise();
	public abstract void eat(Food food) throws Exception;
	private String name;
	private int age;
}