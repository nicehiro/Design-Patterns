package 多进程改进2;

/**
 * Created by hiro on 17-2-6.
 */
public class Singleton {

    // 双重检查加锁
    // volatile 确保当 uniqueInstance 实例化后，多个进程可以正确的处理这个实例
    private volatile static Singleton uniqueInstance;

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
