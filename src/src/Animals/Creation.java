package Animals;

public class Creation {
    public static void main(String[] args) {
        Pet pet = new Pet("Nick", 5);
        petCommands(pet);

        Dog dog = new Dog("Guffi", 2, 5, "Grey", 11.5533);
        dogCommands(dog);

        Cat cat = new Cat("Ars", 11, "bad");
        catCommands(cat);

        System.out.println(cat.animalClass);//final field
        System.out.println(dog.animalClass);//final field
    }

    public static void dogCommands(Dog dog) {
        System.out.println(dog);
        dog.move();
        dog.breath();
        dog.eat(); //final method
        dog.makeNoise();
        dog.doCommand();
        System.out.println();
    }

    public static void catCommands(Cat cat) {
        System.out.println(cat);
        cat.move();
        cat.breath();
        cat.eat(); //final method
        cat.makeNoise();
        System.out.println();
    }

    public static void petCommands(Pet pet) {
        System.out.println(pet);
        pet.move();
        pet.breath();
        pet.eat();//final method
        pet.makeNoise();
        System.out.println();
    }

    public static void animalCommands(Animal animal) {
        System.out.println(animal);
        animal.breath();
        animal.move();
        System.out.println();
    }
}
