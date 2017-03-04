package PizzaIngredientFactory;

import Dough.Dough;
import Dough.ThinCrustDough;
import Sauce.Sauce;
import Sauce.PlumTomatoSauce;
import Cheese.Cheese;
import Cheese.MozzarellaCheese;
import Clam.Clams;
import Clam.FrozenClams;

/**
 * Created by hiro on 17-2-10.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
