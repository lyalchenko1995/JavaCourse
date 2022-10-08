package Animals;

class Dog extends Pet {

    String color;
    double chipNumber;
    int commands;

    public Dog(String name, int age, int commands, String color, double chipNumber) {
        super(name, age);
        this.commands = commands;
        this.color = color;
        this.chipNumber = chipNumber;
    }

    //Inner class
    public class DogRegistrationAddress {
        private String street;
        private String building;
        private String apartment;

        @Override
        public String toString() {
            return "DogRegistrationAddress{" +
                    "street='" + street + '\'' +
                    ", building='" + building + '\'' +
                    ", apartment='" + apartment + '\'' +
                    '}';
        }

        public DogRegistrationAddress(String street, String building, String apartment) {
            this.street = street;
            this.building = building;
            this.apartment = apartment;
        }
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", chipNumber=" + chipNumber +
                ", commands=" + commands +
                ", age=" + age +
                ", animalClass='" + animalClass + '\'' +
                '}';
    }
}
