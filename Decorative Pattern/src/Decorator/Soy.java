package Decorator;

import Component.Beverage;

/**
 * Created by hiro on 12/30/16.
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Decorator.Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
