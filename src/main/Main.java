package main;

import main.general.Animal;
import main.general.Cat;
import main.general.Dog;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.voice();
        dog.voice();
    }
}
