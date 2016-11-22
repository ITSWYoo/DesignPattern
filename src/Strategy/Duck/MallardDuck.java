package Strategy.Duck;

import Strategy.Duck.Behavior.FlyWithWings;
import Strategy.Duck.Behavior.Quack;
import Strategy.Duck.Duck;

/**
 * Created by Yoo on 2016-11-20.
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuakBehavior(new Quack());
    }

}
