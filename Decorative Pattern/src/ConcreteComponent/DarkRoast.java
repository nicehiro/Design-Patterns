package ConcreteComponent;

import Component.Beverage;

/**
 * Created by hiro on 12/30/16.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "ConcreteComponent.DarkRoast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
