import Duck.Duck;

/**
 * Created by hiro on 12/24/16.
 */
public class Simulator {
    public static void main(String[] args) {
        Duck mallard = new Duck.MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();
    }
}
