package 经典单件模式;

/**
 * Created by hiro on 17-2-6.
 */
public class Singleton {

    // 经典单间模式

    private static Singleton uniqueInstance;

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            return new Singleton();
        } else {
            return uniqueInstance;
        }
    }
}
