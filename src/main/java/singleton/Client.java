package singleton;

/**
 * @author Chenzhengyou
 * @date 2018-08-27
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        SingletonDom3 s1 = SingletonDom3.getInstance();
        SingletonDom3 s2 = SingletonDom3.getInstance();

        System.out.println(s1);
        System.out.println(s2);
    }
}
