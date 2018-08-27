package singleton;

/**
 * @author Chenzhengyou
 * @date 2018-08-27
 * @description: 测试懒汉式单例模式
 */
public class SingletonDom1 {

    /**
     * 类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。
     */
    private static SingletonDom1 instance;

    private SingletonDom1(){ //私有化构造器
    }

    /**
     * 方法同步，调用效率低！
     * @return
     */
    public static  synchronized SingletonDom1  getInstance(){
        if(instance==null){
            instance = new SingletonDom1();
        }
        return instance;
    }
}
