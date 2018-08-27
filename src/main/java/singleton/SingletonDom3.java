package singleton;

/**
 * @author Chenzhengyou
 * @date 2018-08-27
 * @description: 测试静态内部类实现单例模式
 */
public class SingletonDom3 {

    /**
     * 线程安全，调用效率高，并且实现了延时加载！
     */
    private static class SingletonClassInstance {
        private static final SingletonDom3 instance = new SingletonDom3();
    }

    private SingletonDom3(){
    }

    /**
     * 方法没有同步，调用效率高！
     * @return
     */
    public static SingletonDom3  getInstance(){
        return SingletonClassInstance.instance;
    }
}
