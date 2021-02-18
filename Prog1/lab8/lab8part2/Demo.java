public class Demo {
    public static void main(String[] args) {
        ArrayList<Animal> animalslst = new ArrayList<Animal>();

        animalslst.add(new Wolf("LBJ", 35));
        animalslst.add(new Tapir("D-Rose", 34));
        animalslst.add(new Parrot("AD", 26));

        for (Animal animal : animalslst) {
            System.out.println("Animal name: " + animal.getName() + ", Animal age: " + animal.getAge());
        }

        Collections.sort(animalslst);

        for (Animal animal : animalslst) {
            System.out.println("Animal name: " + animal.getName() + ", Animal age: " + animal.getAge());
        }
    }
}