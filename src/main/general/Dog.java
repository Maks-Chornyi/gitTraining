package main.general;

import main.interfaces.Dogable;

public class Dog implements Dogable {

    private int weight;
    private String name;

    @Override
    public void voice() {
        System.out.println("waf");
    }
}
