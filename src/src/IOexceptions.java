import Animals.Animal;
import Animals.Dog;

import java.io.*;
import java.util.ArrayList;

public class IOexceptions {


    public static void main(String[] args) {
        String file = "C:\\Users\\Arsenii_Lialchenko\\Documents\\JAVA\\file.txt";
        IOexceptions io = new IOexceptions();
//        // write object
        Animal dogGuffi = new Dog("Guffi", 2, 5, "Grey", 555);
        Animal dogPenni = new Dog("Penni", 4, 6, "Yellow", 22);
//        io.writeObject(dogGuffi, file);
//        io.writeObject(dogPenni, file);
//        // read objects
//        io.readObject(file);

        try {
            ObjectInputStream oi = new ObjectInputStream(new FileInputStream(file));

            // Read objects
            Animal pr1 = (Animal) oi.readObject();
//            Animal pr2 = (Animal) oi.readObject();

            System.out.println(pr1.toString());
//            System.out.println(pr2.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeObject(Animal animal, String path) {
        FileOutputStream f = null;
        ObjectOutputStream o = null;
        try {
            f = new FileOutputStream(new File(path));
            o = new ObjectOutputStream(f);
            o.writeObject(animal);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                o.close();
                f.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void readObject(String path) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            ArrayList<Animal> arrayList = new ArrayList<>();

            while (true) {
                try {
                    Animal animal = (Animal) ois.readObject();
                    if (animal == null) {
                        break;
                    }
                    arrayList.add(animal);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }

            for (Animal m : arrayList) {
                System.out.println(m);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
