package singleton;

import com.sun.deploy.net.proxy.StaticProxyManager;

/**
 * 懒汉式：  延迟加载  线程不安全
 */
public class SingletonC {

    // 1. 类加载时，先不自动创建单例
    //  即，将单例的引用先赋值为 Null
    private static SingletonC singleton = null;

    // 2. 构造函数 设置为 私有权限
    // 原因：禁止他人创建实例
    private SingletonC() {
    }

    //3. 需要时才手动调用 getSingleton()创建 单例先判断单例是否为空，以避免重复创建
    public static SingletonC getSingleton() {
        if (singleton == null) {
            singleton = new SingletonC();
        }
        return singleton;
    }
}
