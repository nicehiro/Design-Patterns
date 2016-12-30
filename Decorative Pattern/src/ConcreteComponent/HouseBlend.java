package ConcreteComponent;

import Component.Beverage;

/**
 * Created by hiro on 12/30/16.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "ConcreteComponent.HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
