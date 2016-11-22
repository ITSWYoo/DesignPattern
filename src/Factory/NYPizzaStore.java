package Factory;

/**
 * Created by Yoo on 2016-11-21.
 */
class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza =new NYStyleCheesePizza();
        return pizza;
    }
}
