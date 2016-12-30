package ConcreteComponent;

import Component.Beverage;

/**
 * Created by hiro on 12/30/16.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "ConcreteComponent.Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
