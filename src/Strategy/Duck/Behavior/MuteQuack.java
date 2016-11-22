package Strategy.Duck.Behavior;

/**
 * Created by Yoo on 2016-11-20.
 */
public class MuteQuack implements QuakBehavior{

    @Override
    public void quack() {
        System.out.println("Mute");
    }
}
