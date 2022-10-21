package Animals;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Creation {
    public static void main(String[] args) {
        Cat catBarsik = new Cat ("Barsik", 4, "Calm");
        Cat catVasily = new Cat ("Vasily", 10, "Aggressive");
        Cat catPetya = new Cat ("Petya", 1, "Funny");
        Map<Integer, Animal> map = new HashMap<>();
        map.put(1,catBarsik);
        map.put(2,catVasily);
        map.put(3,catPetya);
        System.out.println("Add objects");
        printMap(map);

        System.out.println("Atfer remove");
        map.remove(2);
        printMap(map);

        System.out.println("Atfer replace and update");
        Cat Igor = new Cat ("Igor", 1, "Funny");
        map.replace(3,Igor);
        map.get(1).setName("newCatName");
        printMap(map);
    }


    public static void printMap (Map<Integer, Animal> map) {
        for (Map.Entry<Integer,Animal> item : map.entrySet()) {
            System.out.printf("%d '%s'\n", item.getKey(), item.getValue());
        }
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
