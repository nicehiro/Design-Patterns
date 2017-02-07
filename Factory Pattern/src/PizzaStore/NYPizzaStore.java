package PizzaStore;

import Pizza.Product.Pizza;
import Pizza.NYStyleCheesePizza;
import Pizza.NYStylePepperoniPizza;
import Pizza.NYStyleVeggiePizza;
import PizzaStore.Creator.PizzaStore;

/**
 * Created by hiro on 17-2-5.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
