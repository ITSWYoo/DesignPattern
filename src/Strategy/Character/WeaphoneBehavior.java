package Strategy.Character;

/**
 * Created by Yoo on 2016-09-28.
 */
public interface WeaphoneBehavior {
    void userWeapone();
}
class SwordBehavior implements WeaphoneBehavior{

    @Override
    public void userWeapone() {
        System.out.println("검으로 베기");
    }
}
class KinfeBehavior implements WeaphoneBehavior{

    @Override
    public void userWeapone() {
        System.out.println("칼로 베어");
    }
}
class BowAndArrowBehavior implements WeaphoneBehavior{

    @Override
    public void userWeapone() {
        System.out.println("활을 발사");
    }
}
class AxeBehavior implements WeaphoneBehavior{

    @Override
    public void userWeapone() {
        System.out.println("도끼로 찍기");
    }
}
