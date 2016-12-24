package Quack;

/**
 * Created by hiro on 12/24/16.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Slience");
    }
}
