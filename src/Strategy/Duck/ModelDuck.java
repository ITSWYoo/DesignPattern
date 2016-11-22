package Strategy.Duck;

import Strategy.Duck.Behavior.FlyNoWay;
import Strategy.Duck.Behavior.Squeak;

/**
 * Created by Yoo on 2016-11-20.
 */
public class ModelDuck extends Duck{
    public ModelDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuakBehavior(new Squeak());
    }
}
