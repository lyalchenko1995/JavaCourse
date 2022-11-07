package Animals;

import java.util.regex.Pattern;

public class Creation {
    public static void main(String[] args) {


        Pattern emailPattern = Pattern.compile("\\w+\\@\\D+\\.\\D{0,3}");
        Pattern phonePattern = Pattern.compile("((\\+7)|7|8)+(\\d{10})");
        Pattern bookISBNPattern = Pattern.compile("([978|979])+(\\d{10})");
        Pattern datePattern = Pattern.compile("\\d{4}\\-\\w{3}\\-\\d{2}");

        System.out.println(emailPattern.matcher("lyalchenko2010@yandex.ru").matches());
        System.out.println(phonePattern.matcher("89581741063").matches());
        System.out.println(bookISBNPattern.matcher("9781234567890").matches());
        System.out.println(datePattern.matcher("2022-Oct-17").matches());


//        Pet pet = new Pet("Nick", 5);
//        petCommands(pet);

        Dog dog = new Dog("Guffi", 2,5, "Grey", 11.5533);
        Dog.DogRegistrationAddress address = dog.new DogRegistrationAddress("Ars", "5", "2");
        System.out.println(address);
        System.out.println();
        dogCommands(dog);

//        Cat cat = new Cat("Ars", 11, "bad");
//        catCommands(cat);

//        System.out.println(cat.animalClass);//final field
//        System.out.println(dog.animalClass);//final field

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

//    public static void catCommands(Cat cat) {
//        System.out.println(cat);
//        cat.move();
//        cat.breath();
//        cat.eat(); //final method
//        cat.makeNoise();
//        System.out.println();
//    }
//
//    public static void petCommands(Pet pet) {
//        System.out.println(pet);
//        pet.move();
//        pet.breath();
//        pet.eat();//final method
//        pet.makeNoise();
//        System.out.println();
//    }
//
//    public static void animalCommands(Animal animal) {
//        System.out.println(animal);
//        animal.breath();
//        animal.move();
//        System.out.println();
//    }
}
