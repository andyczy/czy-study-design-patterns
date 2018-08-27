package singleton;

/**
 * @author Chenzhengyou
 * @date 2018-08-27
 * @description: 测试饿汉式单例模式
 */
public class SingletonDom {

    public static void main(String[] args) {
        System.out.print("SingletonDom !");
    }

    /**
     * 类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的是线程安全的！
     */
    private static SingletonDom instance = new SingletonDom();

    private SingletonDom(){
    }

    /**
     * 方法没有同步，调用效率高！
     * @return
     */
    private static SingletonDom getInstance(){
        return instance;
    }
}
