package singleton;

/**
 * @author Chenzhengyou
 * @date 2018-08-27
 * @description: 测试枚举式实现单例模式(没有延时加载)、不会被反射破解
 */
public enum SingletonDom4 {

    /**
     * 这个枚举元素，本身就是单例对象！
     */
    INSTANCE;

    /**
     * 添加自己需要的操作！
     */
    public void singletonOperation(){
    }
}
