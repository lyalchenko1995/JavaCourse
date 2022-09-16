package Animals;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void breath(){
        System.out.println("Animal is breathing ...");
    };

    public  void move(){
        System.out.println("Animal is moving ...");
    };

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
