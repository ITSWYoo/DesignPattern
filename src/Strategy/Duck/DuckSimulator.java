package Strategy.Duck;

import Strategy.Duck.Behavior.Squeak;

/**
 * Created by Yoo on 2016-11-20.
 */
public class DuckSimulator {
    public static void main(String args[]){
        Duck duck = new MallardDuck();
        duck.setQuakBehavior(new Squeak());

    }
}
