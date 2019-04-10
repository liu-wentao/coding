package static_factory;
/*
* 背景：小成有一个塑料生产厂，用来做塑料加工生意
目的：最近推出了3个产品，小成希望使用简单工厂模式实现3款产品的生产
*
* */

/*
* 创建抽象产品类 & 定义具体产品的公共接口；
创建具体产品类（继承抽象产品类） & 定义生产的具体产品；
创建工厂类，通过创建静态方法根据传入不同参数从而创建不同具体产品类的实例；
外界通过调用工厂类的静态方法，传入不同参数从而创建不同具体产品类的实例
* */
public  class Demo {

    // 1.创建抽象产品类，定义具体产品的公共接口
    abstract class Product{
        public abstract void show();
    }

    //2.实现具体的产品类
    //具体产品类A
    class  ProductA extends  Product{

        @Override
        public void show() {
            System.out.println("生产出了产品A");
        }
    }

    //具体产品类B
    class  ProductB extends  Product{

        @Override
        public void show() {
            System.out.println("生产出了产品B");
        }
    }

    //具体产品类C
    class  ProductC extends  Product{

        @Override
        public void show() {
            System.out.println("生产出了产品C");
        }
    }

    //3.创建工厂类，通过创建静态方法从而根据传入不同参数创建不同具体产品类的实例
    static class  Factory {
        public static Product Manufacture(String ProductName){
//工厂类里用switch语句控制生产哪种商品；
//使用者只需要调用工厂类的静态方法就可以实现产品类的实例化。
            switch (ProductName){
                case "A":
                    return new Demo().new ProductA();

                case "B":
                    return new Demo(). new ProductB();

                case "C":
                    return  new Demo().new ProductC();

                default:
                    return null;

            }
        }
    }


    //4.外界通过调用工厂类的静态方法，传入不同参数从而创建不同具体产品类的实例
    public static void main(String[] args){


        //客户要产品A
        try {
//调用工厂类的静态方法 & 传入不同参数从而创建产品实例
            Factory.Manufacture("A").show();
        }catch (NullPointerException e){
            System.out.println("没有这一类产品");
        }

        //客户要产品B
        try {
            Factory.Manufacture("B").show();
        }catch (NullPointerException e){
            System.out.println("没有这一类产品");
        }

        //客户要产品C
        try {
            Factory.Manufacture("C").show();
        }catch (NullPointerException e){
            System.out.println("没有这一类产品");
        }

        //客户要产品D
        try {
            Factory.Manufacture("D").show();
        }catch (NullPointerException e){
            System.out.println("没有这一类产品");
        }
    }
}
