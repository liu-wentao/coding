package singleton;

/*
* 静态内部类实现   线程安全  实现简单   按需加载
* */

public class SingletonF {

    private static class SingletonF_01{
        private static SingletonF singleton = new SingletonF();
    }

    private SingletonF(){};

    public static SingletonF getSingleton(){
        return SingletonF_01.singleton;
    }

}

// 调用过程说明：
// 1. 外部调用类的newInstance()
// 2. 自动调用Singleton2.ourInstance
// 2.1 此时单例类Singleton2得到初始化
// 2.2 而该类在装载 & 被初始化时，会初始化它的静态域，从而创建单例；
// 2.3 由于是静态域，因此只会JVM只会加载1遍，Java虚拟机保证了线程安全性
// 3. 最终只创建1个单例

