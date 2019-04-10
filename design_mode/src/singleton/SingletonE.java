package singleton;

/*
*
* 懒汉式改进   双重锁   实现较为复杂    安全   性能有所优化
* */
public class SingletonE {

    private static SingletonE singleton = null;

    private SingletonE(){};

    public static SingletonE getSingleton(){
        if (singleton == null) {
            synchronized (SingletonE.class) {
                if (singleton == null) {
                    singleton = new SingletonE();
                }
            }
        }
        return singleton;
    }

}
