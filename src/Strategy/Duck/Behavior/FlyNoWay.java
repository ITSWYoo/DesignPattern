package Strategy.Duck.Behavior;

/**
 * Created by Yoo on 2016-11-20.
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("i can't fly No way");
    }
}
