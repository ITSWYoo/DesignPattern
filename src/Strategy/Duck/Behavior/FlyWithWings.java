package Strategy.Duck.Behavior;

/**
 * Created by Yoo on 2016-11-20.
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("i can fly with wings");
    }
}
