package Factory;

import Observer.Weather.Observer;

import java.util.ArrayList;

/**
 * Created by Yoo on 2016-11-21.
 */
abstract public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("preparing " + name);
        System.out.println("Tossing dough..");
        System.out.println("Adding Sauce...");
        System.out.println("Adding toppings");
        for (Object o : toppings) {
            System.out.println(" " + o.toString());
        }
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setToppings(ArrayList toppings) {
        this.toppings = toppings;
    }
}

