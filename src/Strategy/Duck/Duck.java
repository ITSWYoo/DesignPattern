package Strategy.Duck;

import Strategy.Duck.Behavior.FlyBehavior;
import Strategy.Duck.Behavior.QuakBehavior;

/**
 * Created by Yoo on 2016-11-20.
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuakBehavior quakBehavior;

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuakBehavior getQuakBehavior() {
        return quakBehavior;
    }

    public void setQuakBehavior(QuakBehavior quakBehavior) {
        this.quakBehavior = quakBehavior;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quakBehavior.quack();
    }

    public void swim(){
        System.out.println("I can swim");
    }
}
