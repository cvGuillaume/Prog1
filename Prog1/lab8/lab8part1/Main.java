public class Main
{
    public static void main(String[] args)
    {
        Wolf myWolf = new Wolf("Melo", 14);
        Parrot myParrot = new Parrot("KP", 15);
        Tapir myTapir = new Tapir("Kobe", 24);
        
        Meat meat = new Meat("Beef");
        Plant plant = new Plant("Salad");

        System.out.println("The wolf is called " + myWolf.getName() + " it is " + myWolf.getAge() + " years old.");
        System.out.println("The parrot is called " + myParrot.getName() + " it is " + myParrot.getAge() + " years old.");
        System.out.println("The tapir is called " + myTapir.getName() + " it is " + myTapir.getAge() + " years old.");


        try
        {
            myTapir.eat(meat);
            myWolf.eat(plant);
        } 
        catch (Exception e)
        {
			System.err.println(e);
		}

		myWolf.eat(meat, 5);

		Wolf wolfConstructTest = new Wolf();
    }    
}
