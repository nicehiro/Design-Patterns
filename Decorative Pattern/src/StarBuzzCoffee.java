import Component.Beverage;
import ConcreteComponent.DarkRoast;
import ConcreteComponent.Espresso;
import Decorator.Mocha;
import Decorator.Whip;

/**
 * Created by hiro on 12/30/16.
 */
public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
