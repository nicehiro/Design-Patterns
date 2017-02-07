import PizzaStore.ChicagoPizzaStore;
import PizzaStore.NYPizzaStore;
import Pizza.Product.Pizza;
import PizzaStore.Creator.PizzaStore;

/**
 * Created by hiro on 17-2-5.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("ordered a " + pizza.getName() + "\n");
    }
}
