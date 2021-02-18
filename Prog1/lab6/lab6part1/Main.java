public class Main {
    public static void main(String[] args) {
        Wolf myWolf = new Wolf("Melo", 14);
        Parrot myParrot = new Parrot("KP", 15);

        System.out.println("The wolf is called " + myWolf.getName() + " it is " + myWolf.getAge() + " years old.");
		System.out.println("The parrot is called " + myParrot.getName() + " it is " + myParrot.getAge() + " years old.");
    }    
}
