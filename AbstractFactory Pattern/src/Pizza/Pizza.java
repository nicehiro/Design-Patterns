package Pizza;

import Cheese.Cheese;
import Dough.Dough;
import Clam.Clams;
import Sauce.Sauce;

/**
 * Created by hiro on 17-2-10.
 */
public abstract class Pizza {

    private String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza int diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore.PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
