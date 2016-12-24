package Fly;

import Fly.FlyBehavior;

/**
 * Created by hiro on 12/24/16.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
