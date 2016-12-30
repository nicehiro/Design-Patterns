package Decorator;

import Component.Beverage;

/**
 * Created by hiro on 12/30/16.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
