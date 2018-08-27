public class Singleton1{
    
    //测试饿汉式单例模式
    public static void main(String[] args) {
        //alt + b
        System.out.print("VS Code 测试Java环境!");
    }

    //类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的是线程安全的！
    private static Singleton1 instance = new Singleton1();

    private Singleton1(){
    }

    //方法没有同步，调用效率高！
    private static Singleton1 getInstance(){
        return instance;
    }
}