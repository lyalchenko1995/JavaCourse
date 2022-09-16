package Animals;

public class Pet extends Animal {
    int age;
    final String animalClass = "Pet";

    public Pet(String name, int age) {
        super(name);
        this.age = age;
    }


    public final void eat(){
        System.out.println("Pet is eating ...");
    };


    public void makeNoise(){
        System.out.println("Pet is making noise ...");
    };


    @Override
    public void breath() {
        System.out.println("Pet is breathing ...");
    }

    @Override
    public void move() {
        System.out.println("Pet is moving ...");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
