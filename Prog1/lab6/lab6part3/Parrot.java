public class Parrot extends Omnivore
{
  Parrot(String name, int age)
  {
    super(name, age);
  }
  
  public void makeNoise()
  {
    System.out.println("Krrkrr");
  }
}