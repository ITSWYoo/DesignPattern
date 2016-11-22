package Strategy.Duck.Behavior;

/**
 * Created by Yoo on 2016-11-20.
 */
public class Squeak implements QuakBehavior {

    @Override
    public void quack() {
        System.out.println("THrrrrr");
    }
}
