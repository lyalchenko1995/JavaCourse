import Animals.Animal;
import Animals.Dog;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class IOexceptions {


    public static void main(String[] args){
        String path = "resources/file.txt";

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("New animal was saved");
                    Animal dogGuffi = new Dog("Guffi", 2, 5, "Grey", 555);
                    writeObject(dogGuffi, path);
                    break;
                case 2:
                    System.out.println("Show all saved animals from the file");
                    readObject(path);
                    break;
                case 3:
                    System.out.println("Quit");
                    scanner.close();
                    return;
                default:
                    try {
                        throw new MyExpression("You chose invalid number of operation");
                    } catch (MyExpression e) {
                        e.printStackTrace();
                    }
            }
        }

    }

    public static void writeObject(Animal animal, String path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path, true);
            fileOutputStream.write(animal.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readObject(String path) {
        try {
            Files.readAllLines(Path.of(path)).forEach(l -> System.out.println(l));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    static class MyExpression extends Exception {
        public MyExpression(String message) {
            super(message);
        }
    }
}
