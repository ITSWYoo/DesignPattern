package Decorator;

/**
 * Created by Yoo on 2016-09-28.
 */
public class Whip extends CondimentDecorator {
    /**
     * The Beverage.
     */
    Beverage beverage;

    /**
     * Instantiates a new Whip.
     *
     * @param beverage the beverage
     */
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
