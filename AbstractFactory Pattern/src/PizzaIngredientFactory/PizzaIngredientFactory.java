package PizzaIngredientFactory;

import Dough.Dough;
import Sauce.Sauce;
import Cheese.Cheese;
import Clam.Clams;

/**
 * Created by hiro on 17-2-10.
 */
public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clams createClams();
}
