package Animals;

public abstract class Animal implements Actions{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public Animal(String name) {
        this.name = name;
    }
}
