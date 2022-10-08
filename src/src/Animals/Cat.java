package Animals;

public class Cat extends Pet {
    String character;
    public Cat(String name, int age, String character) {
        super(name, age);
        this.character = character;
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat is making noise ...");
    }

    @Override
    public void breath() {
        System.out.println("Cat is breathing ...");
    }

    @Override
    public void move() {
        System.out.println("Cat is moving ...");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", character='" + character + '\'' +
                ", age=" + age +
                ", animalClass='" + animalClass + '\'' +
                '}';
    }
}
