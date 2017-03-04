package PizzaIngredientFactory;

import Dough.Dough;
import Dough.ThickCrustDough;
import Sauce.Sauce;
import Sauce.MarinaraSauce;
import Cheese.Cheese;
import Cheese.ReggianoCheese;
import Clam.Clams;
import Clam.FreshClams;


/**
 * Created by hiro on 17-2-10.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
