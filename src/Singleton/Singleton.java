package Singleton;

import java.util.Arrays;

/**
 * Created by Yoo on 2016-11-22.
 */
public class Singleton {
    private static Singleton singletonInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

    public static void main(String args[]) {

        Integer i = new Integer(1);
        Integer w = new Integer(1);
        System.out.println(i == w);
        System.out.println(i.intValue() == w.intValue());

    }
}