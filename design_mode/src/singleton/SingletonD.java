package singleton;


/*
* 懒汉式改进： 延迟加载 线程安全  耗时  耗能
* */

public class SingletonD {


    private static SingletonD singleton = null;


    private SingletonD() {

    }

    //写法一：使用同步代码块
    public static  SingletonD getSingleton() {
        synchronized (SingletonD.class){
        if (singleton == null) {
            singleton = new SingletonD();
        }
        return singleton;
        }
    }

    //写法二：将synchronized关键字作用于方法声明处
   /* public static  synchronized SingletonD getSingleton() {

        if (singleton == null) {
            singleton = new SingletonD();
        }
        return singleton;
    }
*/
}
