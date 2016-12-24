package Duck;

import Fly.FlyWithWings;
import Quack.Quack;

/**
 * Created by hiro on 12/24/16.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
