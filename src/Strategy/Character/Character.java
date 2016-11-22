package Strategy.Character;

/**
 * Created by Yoo on 2016-09-28.
 */
abstract public class Character {
    WeaphoneBehavior weaphoneBehavior;
    abstract public void fight();

    public void setWeaphoneBehavior(WeaphoneBehavior weaphoneBehavior) {
        this.weaphoneBehavior = weaphoneBehavior;
    }
}
