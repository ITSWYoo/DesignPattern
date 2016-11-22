package Decorator;

/**
 * Created by Yoo on 2016-09-28.
 */
public class Mocha extends CondimentDecorator {
    /**
     * The Beverage.
     */
    Beverage beverage;

    /**
     * Instantiates a new Mocha.
     *
     * @param beverage the beverage
     */
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
