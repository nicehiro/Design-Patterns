package PizzaStore;

import Pizza.Product.Pizza;
import Pizza.ChicagoStyleCheesePizza;
import Pizza.ChicagoStylePepperoniPizza;
import Pizza.ChicagoStyleVeggiePizza;
import PizzaStore.Creator.PizzaStore;

/**
 * Created by hiro on 17-2-5.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
