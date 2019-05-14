package main.general;

import main.interfaces.Animal;

public class Wolf implements Animal {
    @Override
    public void voice() {
        System.out.println("Ahhoooo");
    }

    public void makeWaf() {
        System.out.println();
    }
}
