package Decorator;

/**
 * Created by Yoo on 2016-09-28.
 */
public class SteamMilk extends CondimentDecorator {
    /**
     * The Beverage.
     */
    Beverage beverage;

    /**
     * Instantiates a new Steam milk.
     *
     * @param beverage the beverage
     */
    public SteamMilk(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", SteamMilk";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
