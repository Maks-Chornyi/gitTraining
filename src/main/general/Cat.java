package main.general;

import main.interfaces.Animal;

public class Cat implements Animal {

    @Override
    public void voice() {
        System.out.println("Meu");
    }
}
