package Animals;

import java.util.Objects;

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
                "character='" + character + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(character, cat.character);
    }

    @Override
    public int hashCode() {
        return Objects.hash(character);
    }
}
