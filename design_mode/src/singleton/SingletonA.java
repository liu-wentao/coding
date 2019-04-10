package singleton;

/*
* 饿汉式：  立即加载  线程安全   初始化速度快，内存占用小
* */
public class SingletonA {

    private static SingletonA singleton = new SingletonA();

    private SingletonA(){};

    public static SingletonA getSingleton(){
        return singleton;
    }

}
