package Component;

/**
 * Created by hiro on 12/30/16.
 */
public abstract class Beverage {
    protected String description = "Unknow Component.Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
