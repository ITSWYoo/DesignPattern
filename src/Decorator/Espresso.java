package Decorator;

/**
 * Created by Yoo on 2016-09-28.
 */
public class Espresso extends Beverage {
    /**
     * Instantiates a new Espresso.
     */
    public Espresso() {
        description = "Espresso";

    }

    @Override
    public double cost() {
        return 1.99;
    }
}
