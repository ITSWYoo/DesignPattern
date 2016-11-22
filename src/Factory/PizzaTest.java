package Factory;

/**
 * Created by Yoo on 2016-11-21.
 */
public class PizzaTest {
    public static void main(String args[]){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.createPizza("cheese");

        System.out.println(pizza.getName());
        pizza = chicagoStore.createPizza("cheese");
        System.out.println(pizza.getName());

    }
}
