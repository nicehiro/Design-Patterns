package Decorator;

import Component.Beverage;

/**
 * Created by hiro on 12/30/16.
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Decorator.Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
