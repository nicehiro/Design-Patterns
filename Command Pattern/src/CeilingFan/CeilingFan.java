package CeilingFan;

/**
 * Created by hiro on 17-2-6.
 */
public class CeilingFan {
    // 电风扇
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
        System.out.println(location + "'s speed is " + OFF);
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + "'s speed is " + HIGH);
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + "'s speed is " + MEDIUM);
    }

    public void low() {
        speed = LOW;
        System.out.println(location + "'s speed is " + LOW);
    }

    public void off() {
        speed = OFF;
        System.out.println(location + "'s speed is " + OFF);
    }

    public int getSpeed() {
        return speed;
    }
}
