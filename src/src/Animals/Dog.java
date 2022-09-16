package Animals;

public class Dog extends Pet {
    int comands;
    String color;
    double chipNumber;

    public Dog(String name, int age, int comands, String color, double chipNumber) {
        super(name, age);
        this.comands = comands;
        this.color = color;
        this.chipNumber = chipNumber;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "comands=" + comands +
                ", color='" + color + '\'' +
                ", chipNumber=" + chipNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void doCommand () {
        System.out.println("Dog is doing command ...");
    }

    @Override
    public void breath() {
        System.out.println("Dog is breathing ...");
    }

    @Override
    public void move() {
        System.out.println("Dog is moving ...");
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog is making noise ...");
    }

}
