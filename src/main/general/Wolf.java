package main.general;

import main.interfaces.Dogable;
import main.interfaces.StaticData;

public class Wolf implements Dogable {

    public void makeAwhooo() {
        System.out.println("Awhooo" + StaticData.COUNT_OF_MONTHS);
    }
}
