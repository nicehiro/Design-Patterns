package PizzaStore;

import Pizza.ClamPizza;
import Pizza.CheesePizza;
import Pizza.Pizza;
import PizzaIngredientFactory.NYPizzaIngredientFactory;
import PizzaIngredientFactory.PizzaIngredientFactory;

/**
 * Created by hiro on 17-2-10.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NewYork  Style Cheese.Cheese Pizza.Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NewYork Style Clam Pizza.Pizza");
        }

        return pizza;
    }
}
