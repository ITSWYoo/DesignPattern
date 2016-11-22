package Strategy.Character;


/**
 * Created by Yoo on 2016-09-28.
 */
public class CharacterTest {
    public static void main(String args[]) {
        Character king = new King();
        king.setWeaphoneBehavior(new KinfeBehavior());
        king.fight();

        Character queen = new Queen();
        queen.setWeaphoneBehavior(new BowAndArrowBehavior());
        queen.fight();

        Character knight = new Knight();
        knight.setWeaphoneBehavior(new SwordBehavior());
        knight.fight();

        Character troll = new Troll();
        troll.setWeaphoneBehavior(new AxeBehavior());
        troll.fight();
    }
}
