package main;

import main.interfaces.Animal;
import main.general.Cat;
import main.general.Dog;
import main.interfaces.Dogable;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Dogable dog = new Dog();
        cat.voice();
        dog.voice();
    }
}
