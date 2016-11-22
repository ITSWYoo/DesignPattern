package Factory;

/**
 * Created by Yoo on 2016-11-21.
 */
class ChicagoPizzaStore extends PizzaStore{


    @Override
    Pizza createPizza(String type) {
        Pizza pizza = new ChicagoStyleCheesePizza();
        return pizza;
    }
}
