package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author Chenzhengyou
 * @date 2018-08-27
 * @description:
 */
public class Client {

    public static void main(String[] args) throws Exception {
        SingletonDom3 s1 = SingletonDom3.getInstance();
        SingletonDom3 s2 = SingletonDom3.getInstance();

        System.out.println(s1);
        System.out.println(s2);


        //通过反射的方式直接调用私有构造器
		Class<SingletonDom11> clazz = (Class<SingletonDom11>) Class.forName("singleton.SingletonDemo11");
		Constructor<SingletonDom11> c = clazz.getDeclaredConstructor(null);
		c.setAccessible(true);
        SingletonDom11  s3 = c.newInstance();
        SingletonDom11  s4 = c.newInstance();
		System.out.println(s3);
		System.out.println(s4);


        //通过反序列化的方式构造多个对象
        FileOutputStream fos = new FileOutputStream("d:/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
        SingletonDom11 s23 =  (SingletonDom11) ois.readObject();
        System.out.println(s23);
    }
}
