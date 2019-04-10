package singleton;

/**
 * 枚举实现： 立即加载  最简洁易用   线程安全
 */
public enum  SingletonB {

    //定义1个枚举的元素，即为单例类的1个实例
    INSTANCE;

    // 隐藏了1个空的、私有的 构造方法
    // private SingletonB () {}

    // 获取单例的方式：
//    SingletonB singleton = SingletonB.INSTANCE;
}
