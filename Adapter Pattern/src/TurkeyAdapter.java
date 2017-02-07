/**
 * Created by hiro on 17-2-7.
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quck() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
