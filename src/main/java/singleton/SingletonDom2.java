package singleton;

/**
 * @author Chenzhengyou
 * @date 2018-08-27
 * @description: 双重检查锁实现单例模式
 */
public class SingletonDom2 {

    private static SingletonDom2 instance = null;

    public static SingletonDom2 getInstance() {
        if (instance == null) {
            SingletonDom2 sc;
            synchronized (SingletonDom2.class) {
                sc = instance;
                if (sc == null) {
                    synchronized (SingletonDom2.class) {
                        if(sc == null) {
                            sc = new SingletonDom2();
                        }
                    }
                    instance = sc;
                }
            }
        }
        return instance;
    }

    private SingletonDom2() {

    }
}
