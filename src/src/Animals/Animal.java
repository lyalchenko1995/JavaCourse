package Animals;

import java.io.Serializable;

public abstract class Animal implements Actions, Serializable {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}
