package Decorator;

import java.io.BufferedReader;

/**
 * Created by Yoo on 2016-09-28.
 */
public class DecoratorEx {
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String args[]) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $"+espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription()+ " $"+darkRoast.cost());
    }
}
