# 单例设计模式

通过单例模式可以保证系统中，应用该模式的类一个类只有一个实例。即一个类只有一个对象实例。


![](https://github.com/andyczy/czy-study-design-patterns/blob/master/src/main/java/singleton/singleton.png "单例设计模式")


## 饿汉式单例模式 *
![](https://github.com/andyczy/czy-study-design-patterns/blob/master/src/main/java/singleton/SingletonDom.png "单例设计模式")



## 懒汉式单例模式 *
![](https://github.com/andyczy/czy-study-design-patterns/blob/master/src/main/java/singleton/SingletonDom1.png "单例设计模式")


## 双重检查锁单例模式
    同步逻辑使用了if,提高了执行的效率，只有第一次才同步创建。

    问题：由于编译器优化原因和JVM底层内部模型原因，偶尔会出问题，不建议使用。
    

## 测试静态内部类单例模式 *
![](https://github.com/andyczy/czy-study-design-patterns/blob/master/src/main/java/singleton/SingletonDom3.png "单例设计模式")



## 如何选用
![](https://github.com/andyczy/czy-study-design-patterns/blob/master/src/main/java/singleton/singleton1.png "单例设计模式")
