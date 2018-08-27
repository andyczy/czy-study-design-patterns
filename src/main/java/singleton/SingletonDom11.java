package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author Chenzhengyou
 * @date 2018-08-27
 * @description: 测试懒汉式单例模式(如何防止反射和反序列化漏洞)
 */
public class SingletonDom11  implements Serializable {
    /**
     * 类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。
     */
    private static SingletonDom11 instance;

    private SingletonDom11(){ //私有化构造器
        if(instance!=null){
            throw new RuntimeException();
        }
    }

    /**
     * 方法同步，调用效率低！
     * @return
     */
    public static  synchronized SingletonDom11  getInstance(){
        if(instance==null){
            instance = new SingletonDom11();
        }
        return instance;
    }

    /**
     * 反序列化时，如果定义了readResolve()则直接返回此方法指定的对象。而不需要单独再创建新对象！
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
