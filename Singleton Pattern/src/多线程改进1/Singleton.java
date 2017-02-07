package 多线程改进1;

/**
 * Created by hiro on 17-2-6.
 */
public class Singleton {

    // 直接在最开始实例化，避免多进程问题

    private static Singleton uniqueInstance = new Singleton();

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
