package Pizza.Product;

import java.util.ArrayList;

/**
 * Created by hiro on 17-2-5.
 */
public abstract class Pizza {
    public String name;
    // 面团
    public String dough;
    // 酱油
    public String sauce;
    // 佐料
    public ArrayList toppings = new ArrayList();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("    " + toppings.get(i));
        }
    }

    // 烹饪
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    // 切片
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    // 装箱
    public void box() {
        System.out.println("Place pizza in official PizzaStore.Creator.PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
