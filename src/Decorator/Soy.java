package Decorator;

/**
 * Created by Yoo on 2016-09-28.
 */
public class Soy extends CondimentDecorator {
    /**
     * The Beverage.
     */
    Beverage beverage;

    /**
     * Instantiates a new Soy.
     *
     * @param beverage the beverage
     */
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
