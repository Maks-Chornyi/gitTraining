package main.interfaces;

public interface Dogable {
    default void voice() {
        System.out.println("waf-waf");
    }
}
