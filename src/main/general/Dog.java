package main.general;

import main.interfaces.Animal;

public class Dog implements Animal {

    private int weight;
    private String name;

    @Override
    public void voice() {
        System.out.println("waf");
    }
}
